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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.lr.getdb.exception.NoSuchGetDbException;
import com.lr.getdb.model.GetDb;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the get db service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GetDbUtil
 * @generated
 */
@ProviderType
public interface GetDbPersistence extends BasePersistence<GetDb> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GetDbUtil} to access the get db persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the get dbs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching get dbs
	 */
	public java.util.List<GetDb> findByUuid(String uuid);

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
	public java.util.List<GetDb> findByUuid(String uuid, int start, int end);

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
	public java.util.List<GetDb> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GetDb>
			orderByComparator);

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
	public java.util.List<GetDb> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GetDb>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first get db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching get db
	 * @throws NoSuchGetDbException if a matching get db could not be found
	 */
	public GetDb findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GetDb>
				orderByComparator)
		throws NoSuchGetDbException;

	/**
	 * Returns the first get db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching get db, or <code>null</code> if a matching get db could not be found
	 */
	public GetDb fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GetDb>
			orderByComparator);

	/**
	 * Returns the last get db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching get db
	 * @throws NoSuchGetDbException if a matching get db could not be found
	 */
	public GetDb findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GetDb>
				orderByComparator)
		throws NoSuchGetDbException;

	/**
	 * Returns the last get db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching get db, or <code>null</code> if a matching get db could not be found
	 */
	public GetDb fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GetDb>
			orderByComparator);

	/**
	 * Returns the get dbs before and after the current get db in the ordered set where uuid = &#63;.
	 *
	 * @param Id the primary key of the current get db
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next get db
	 * @throws NoSuchGetDbException if a get db with the primary key could not be found
	 */
	public GetDb[] findByUuid_PrevAndNext(
			long Id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GetDb>
				orderByComparator)
		throws NoSuchGetDbException;

	/**
	 * Removes all the get dbs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of get dbs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching get dbs
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the get db in the entity cache if it is enabled.
	 *
	 * @param getDb the get db
	 */
	public void cacheResult(GetDb getDb);

	/**
	 * Caches the get dbs in the entity cache if it is enabled.
	 *
	 * @param getDbs the get dbs
	 */
	public void cacheResult(java.util.List<GetDb> getDbs);

	/**
	 * Creates a new get db with the primary key. Does not add the get db to the database.
	 *
	 * @param Id the primary key for the new get db
	 * @return the new get db
	 */
	public GetDb create(long Id);

	/**
	 * Removes the get db with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the get db
	 * @return the get db that was removed
	 * @throws NoSuchGetDbException if a get db with the primary key could not be found
	 */
	public GetDb remove(long Id) throws NoSuchGetDbException;

	public GetDb updateImpl(GetDb getDb);

	/**
	 * Returns the get db with the primary key or throws a <code>NoSuchGetDbException</code> if it could not be found.
	 *
	 * @param Id the primary key of the get db
	 * @return the get db
	 * @throws NoSuchGetDbException if a get db with the primary key could not be found
	 */
	public GetDb findByPrimaryKey(long Id) throws NoSuchGetDbException;

	/**
	 * Returns the get db with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the get db
	 * @return the get db, or <code>null</code> if a get db with the primary key could not be found
	 */
	public GetDb fetchByPrimaryKey(long Id);

	/**
	 * Returns all the get dbs.
	 *
	 * @return the get dbs
	 */
	public java.util.List<GetDb> findAll();

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
	public java.util.List<GetDb> findAll(int start, int end);

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
	public java.util.List<GetDb> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GetDb>
			orderByComparator);

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
	public java.util.List<GetDb> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GetDb>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the get dbs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of get dbs.
	 *
	 * @return the number of get dbs
	 */
	public int countAll();

}