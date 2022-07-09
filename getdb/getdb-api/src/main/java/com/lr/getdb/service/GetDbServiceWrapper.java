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
 * Provides a wrapper for {@link GetDbService}.
 *
 * @author Brian Wing Shun Chan
 * @see GetDbService
 * @generated
 */
public class GetDbServiceWrapper
	implements GetDbService, ServiceWrapper<GetDbService> {

	public GetDbServiceWrapper(GetDbService getDbService) {
		_getDbService = getDbService;
	}

	@Override
	public com.lr.getdb.model.GetDb addEmployee(String name) {
		return _getDbService.addEmployee(name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _getDbService.getOSGiServiceIdentifier();
	}

	@Override
	public GetDbService getWrappedService() {
		return _getDbService;
	}

	@Override
	public void setWrappedService(GetDbService getDbService) {
		_getDbService = getDbService;
	}

	private GetDbService _getDbService;

}