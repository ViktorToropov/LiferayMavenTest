/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.lr.getdb.service.persistence.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import com.lr.getdb.exception.NoSuchGetDbException;
import com.lr.getdb.model.GetDb;
import com.lr.getdb.service.GetDbLocalServiceUtil;
import com.lr.getdb.service.persistence.GetDbPersistence;
import com.lr.getdb.service.persistence.GetDbUtil;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class GetDbPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.lr.getdb.service"));

	@Before
	public void setUp() {
		_persistence = GetDbUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<GetDb> iterator = _getDbs.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GetDb getDb = _persistence.create(pk);

		Assert.assertNotNull(getDb);

		Assert.assertEquals(getDb.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		GetDb newGetDb = addGetDb();

		_persistence.remove(newGetDb);

		GetDb existingGetDb = _persistence.fetchByPrimaryKey(
			newGetDb.getPrimaryKey());

		Assert.assertNull(existingGetDb);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addGetDb();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GetDb newGetDb = _persistence.create(pk);

		newGetDb.setUuid(RandomTestUtil.randomString());

		newGetDb.setName(RandomTestUtil.randomString());

		_getDbs.add(_persistence.update(newGetDb));

		GetDb existingGetDb = _persistence.findByPrimaryKey(
			newGetDb.getPrimaryKey());

		Assert.assertEquals(existingGetDb.getUuid(), newGetDb.getUuid());
		Assert.assertEquals(existingGetDb.getId(), newGetDb.getId());
		Assert.assertEquals(existingGetDb.getName(), newGetDb.getName());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		GetDb newGetDb = addGetDb();

		GetDb existingGetDb = _persistence.findByPrimaryKey(
			newGetDb.getPrimaryKey());

		Assert.assertEquals(existingGetDb, newGetDb);
	}

	@Test(expected = NoSuchGetDbException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<GetDb> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"lr_GetDb", "uuid", true, "Id", true, "name", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		GetDb newGetDb = addGetDb();

		GetDb existingGetDb = _persistence.fetchByPrimaryKey(
			newGetDb.getPrimaryKey());

		Assert.assertEquals(existingGetDb, newGetDb);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GetDb missingGetDb = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingGetDb);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		GetDb newGetDb1 = addGetDb();
		GetDb newGetDb2 = addGetDb();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGetDb1.getPrimaryKey());
		primaryKeys.add(newGetDb2.getPrimaryKey());

		Map<Serializable, GetDb> getDbs = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, getDbs.size());
		Assert.assertEquals(newGetDb1, getDbs.get(newGetDb1.getPrimaryKey()));
		Assert.assertEquals(newGetDb2, getDbs.get(newGetDb2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, GetDb> getDbs = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(getDbs.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		GetDb newGetDb = addGetDb();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGetDb.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, GetDb> getDbs = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, getDbs.size());
		Assert.assertEquals(newGetDb, getDbs.get(newGetDb.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, GetDb> getDbs = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(getDbs.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		GetDb newGetDb = addGetDb();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGetDb.getPrimaryKey());

		Map<Serializable, GetDb> getDbs = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, getDbs.size());
		Assert.assertEquals(newGetDb, getDbs.get(newGetDb.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			GetDbLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<GetDb>() {

				@Override
				public void performAction(GetDb getDb) {
					Assert.assertNotNull(getDb);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		GetDb newGetDb = addGetDb();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GetDb.class, _dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("Id", newGetDb.getId()));

		List<GetDb> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		GetDb existingGetDb = result.get(0);

		Assert.assertEquals(existingGetDb, newGetDb);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GetDb.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("Id", RandomTestUtil.nextLong()));

		List<GetDb> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		GetDb newGetDb = addGetDb();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GetDb.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("Id"));

		Object newId = newGetDb.getId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("Id", new Object[] {newId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingId = result.get(0);

		Assert.assertEquals(existingId, newId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GetDb.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("Id"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Id", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected GetDb addGetDb() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GetDb getDb = _persistence.create(pk);

		getDb.setUuid(RandomTestUtil.randomString());

		getDb.setName(RandomTestUtil.randomString());

		_getDbs.add(_persistence.update(getDb));

		return getDb;
	}

	private List<GetDb> _getDbs = new ArrayList<GetDb>();
	private GetDbPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}