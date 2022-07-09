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

package com.lr.getdb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lr.getdb.service.http.GetDbServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class GetDbSoap implements Serializable {

	public static GetDbSoap toSoapModel(GetDb model) {
		GetDbSoap soapModel = new GetDbSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static GetDbSoap[] toSoapModels(GetDb[] models) {
		GetDbSoap[] soapModels = new GetDbSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GetDbSoap[][] toSoapModels(GetDb[][] models) {
		GetDbSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GetDbSoap[models.length][models[0].length];
		}
		else {
			soapModels = new GetDbSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GetDbSoap[] toSoapModels(List<GetDb> models) {
		List<GetDbSoap> soapModels = new ArrayList<GetDbSoap>(models.size());

		for (GetDb model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GetDbSoap[soapModels.size()]);
	}

	public GetDbSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private String _uuid;
	private long _Id;
	private String _name;

}