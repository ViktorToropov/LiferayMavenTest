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

package com.lr.getdb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GetDbLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GetDbLocalService
 * @generated
 */
public class GetDbLocalServiceWrapper
	implements GetDbLocalService, ServiceWrapper<GetDbLocalService> {

	public GetDbLocalServiceWrapper(GetDbLocalService getDbLocalService) {
		_getDbLocalService = getDbLocalService;
	}

	@Override
	public com.lr.getdb.model.GetDb addEmployee(String name) {
		return _getDbLocalService.addEmployee(name);
	}

	/**
	 * Adds the get db to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GetDbLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param getDb the get db
	 * @return the get db that was added
	 */
	@Override
	public com.lr.getdb.model.GetDb addGetDb(com.lr.getdb.model.GetDb getDb) {
		return _getDbLocalService.addGetDb(getDb);
	}

	/**
	 * Creates a new get db with the primary key. Does not add the get db to the database.
	 *
	 * @param Id the primary key for the new get db
	 * @return the new get db
	 */
	@Override
	public com.lr.getdb.model.GetDb createGetDb(long Id) {
		return _getDbLocalService.createGetDb(Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _getDbLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the get db from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GetDbLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param getDb the get db
	 * @return the get db that was removed
	 */
	@Override
	public com.lr.getdb.model.GetDb deleteGetDb(
		com.lr.getdb.model.GetDb getDb) {

		return _getDbLocalService.deleteGetDb(getDb);
	}

	/**
	 * Deletes the get db with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GetDbLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Id the primary key of the get db
	 * @return the get db that was removed
	 * @throws PortalException if a get db with the primary key could not be found
	 */
	@Override
	public com.lr.getdb.model.GetDb deleteGetDb(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _getDbLocalService.deleteGetDb(Id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _getDbLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _getDbLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _getDbLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.lr.getdb.model.impl.GetDbModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _getDbLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.lr.getdb.model.impl.GetDbModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _getDbLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _getDbLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _getDbLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.lr.getdb.model.GetDb fetchGetDb(long Id) {
		return _getDbLocalService.fetchGetDb(Id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _getDbLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the get db with the primary key.
	 *
	 * @param Id the primary key of the get db
	 * @return the get db
	 * @throws PortalException if a get db with the primary key could not be found
	 */
	@Override
	public com.lr.getdb.model.GetDb getGetDb(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _getDbLocalService.getGetDb(Id);
	}

	/**
	 * Returns a range of all the get dbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.lr.getdb.model.impl.GetDbModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of get dbs
	 * @param end the upper bound of the range of get dbs (not inclusive)
	 * @return the range of get dbs
	 */
	@Override
	public java.util.List<com.lr.getdb.model.GetDb> getGetDbs(
		int start, int end) {

		return _getDbLocalService.getGetDbs(start, end);
	}

	/**
	 * Returns the number of get dbs.
	 *
	 * @return the number of get dbs
	 */
	@Override
	public int getGetDbsCount() {
		return _getDbLocalService.getGetDbsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _getDbLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _getDbLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _getDbLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the get db in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GetDbLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param getDb the get db
	 * @return the get db that was updated
	 */
	@Override
	public com.lr.getdb.model.GetDb updateGetDb(
		com.lr.getdb.model.GetDb getDb) {

		return _getDbLocalService.updateGetDb(getDb);
	}

	@Override
	public GetDbLocalService getWrappedService() {
		return _getDbLocalService;
	}

	@Override
	public void setWrappedService(GetDbLocalService getDbLocalService) {
		_getDbLocalService = getDbLocalService;
	}

	private GetDbLocalService _getDbLocalService;

}