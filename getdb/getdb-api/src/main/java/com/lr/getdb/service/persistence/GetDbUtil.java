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

package com.lr.getdb.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.lr.getdb.model.GetDb;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the get db service. This utility wraps <code>com.lr.getdb.service.persistence.impl.GetDbPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GetDbPersistence
 * @generated
 */
public class GetDbUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(GetDb getDb) {
		getPersistence().clearCache(getDb);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, GetDb> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GetDb> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GetDb> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GetDb> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<GetDb> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static GetDb update(GetDb getDb) {
		return getPersistence().update(getDb);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static GetDb update(GetDb getDb, ServiceContext serviceContext) {
		return getPersistence().update(getDb, serviceContext);
	}

	/**
	 * Returns all the get dbs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching get dbs
	 */
	public static List<GetDb> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the get dbs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GetDbModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of get dbs
	 * @param end the upper bound of the range of get dbs (not inclusive)
	 * @return the range of matching get dbs
	 */
	public static List<GetDb> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the get dbs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GetDbModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of get dbs
	 * @param end the upper bound of the range of get dbs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching get dbs
	 */
	public static List<GetDb> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GetDb> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the get dbs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GetDbModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of get dbs
	 * @param end the upper bound of the range of get dbs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching get dbs
	 */
	public static List<GetDb> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GetDb> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first get db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching get db
	 * @throws NoSuchGetDbException if a matching get db could not be found
	 */
	public static GetDb findByUuid_First(
			String uuid, OrderByComparator<GetDb> orderByComparator)
		throws com.lr.getdb.exception.NoSuchGetDbException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first get db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching get db, or <code>null</code> if a matching get db could not be found
	 */
	public static GetDb fetchByUuid_First(
		String uuid, OrderByComparator<GetDb> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last get db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching get db
	 * @throws NoSuchGetDbException if a matching get db could not be found
	 */
	public static GetDb findByUuid_Last(
			String uuid, OrderByComparator<GetDb> orderByComparator)
		throws com.lr.getdb.exception.NoSuchGetDbException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last get db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching get db, or <code>null</code> if a matching get db could not be found
	 */
	public static GetDb fetchByUuid_Last(
		String uuid, OrderByComparator<GetDb> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the get dbs before and after the current get db in the ordered set where uuid = &#63;.
	 *
	 * @param Id the primary key of the current get db
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next get db
	 * @throws NoSuchGetDbException if a get db with the primary key could not be found
	 */
	public static GetDb[] findByUuid_PrevAndNext(
			long Id, String uuid, OrderByComparator<GetDb> orderByComparator)
		throws com.lr.getdb.exception.NoSuchGetDbException {

		return getPersistence().findByUuid_PrevAndNext(
			Id, uuid, orderByComparator);
	}

	/**
	 * Removes all the get dbs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of get dbs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching get dbs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the get db in the entity cache if it is enabled.
	 *
	 * @param getDb the get db
	 */
	public static void cacheResult(GetDb getDb) {
		getPersistence().cacheResult(getDb);
	}

	/**
	 * Caches the get dbs in the entity cache if it is enabled.
	 *
	 * @param getDbs the get dbs
	 */
	public static void cacheResult(List<GetDb> getDbs) {
		getPersistence().cacheResult(getDbs);
	}

	/**
	 * Creates a new get db with the primary key. Does not add the get db to the database.
	 *
	 * @param Id the primary key for the new get db
	 * @return the new get db
	 */
	public static GetDb create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	 * Removes the get db with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the get db
	 * @return the get db that was removed
	 * @throws NoSuchGetDbException if a get db with the primary key could not be found
	 */
	public static GetDb remove(long Id)
		throws com.lr.getdb.exception.NoSuchGetDbException {

		return getPersistence().remove(Id);
	}

	public static GetDb updateImpl(GetDb getDb) {
		return getPersistence().updateImpl(getDb);
	}

	/**
	 * Returns the get db with the primary key or throws a <code>NoSuchGetDbException</code> if it could not be found.
	 *
	 * @param Id the primary key of the get db
	 * @return the get db
	 * @throws NoSuchGetDbException if a get db with the primary key could not be found
	 */
	public static GetDb findByPrimaryKey(long Id)
		throws com.lr.getdb.exception.NoSuchGetDbException {

		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	 * Returns the get db with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the get db
	 * @return the get db, or <code>null</code> if a get db with the primary key could not be found
	 */
	public static GetDb fetchByPrimaryKey(long Id) {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	 * Returns all the get dbs.
	 *
	 * @return the get dbs
	 */
	public static List<GetDb> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the get dbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GetDbModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of get dbs
	 * @param end the upper bound of the range of get dbs (not inclusive)
	 * @return the range of get dbs
	 */
	public static List<GetDb> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the get dbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GetDbModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of get dbs
	 * @param end the upper bound of the range of get dbs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of get dbs
	 */
	public static List<GetDb> findAll(
		int start, int end, OrderByComparator<GetDb> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the get dbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GetDbModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of get dbs
	 * @param end the upper bound of the range of get dbs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of get dbs
	 */
	public static List<GetDb> findAll(
		int start, int end, OrderByComparator<GetDb> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the get dbs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of get dbs.
	 *
	 * @return the number of get dbs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GetDbPersistence getPersistence() {
		return _persistence;
	}

	private static volatile GetDbPersistence _persistence;

}