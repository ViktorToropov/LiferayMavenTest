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

package com.lr.getdb.service.impl;

import com.liferay.portal.aop.AopService;

import com.lr.getdb.model.GetDb;
import com.lr.getdb.model.impl.GetDbImpl;
import com.lr.getdb.service.base.GetDbLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.lr.getdb.model.GetDb",
	service = AopService.class
)
public class GetDbLocalServiceImpl extends GetDbLocalServiceBaseImpl {
	public GetDb addEmployee(String name) {
		GetDb dbpsb = new GetDbImpl();

		dbpsb.setName(name);

		long dbpId = counterLocalService.increment(GetDb.class.getName());
		dbpsb.setId(dbpId);

		getDbLocalService.addGetDb(dbpsb);

		return dbpsb;
	}
}