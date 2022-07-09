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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link GetDb}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GetDb
 * @generated
 */
public class GetDbWrapper
	extends BaseModelWrapper<GetDb> implements GetDb, ModelWrapper<GetDb> {

	public GetDbWrapper(GetDb getDb) {
		super(getDb);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Id", getId());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	 * Returns the ID of this get db.
	 *
	 * @return the ID of this get db
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the name of this get db.
	 *
	 * @return the name of this get db
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this get db.
	 *
	 * @return the primary key of this get db
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this get db.
	 *
	 * @return the uuid of this get db
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ID of this get db.
	 *
	 * @param Id the ID of this get db
	 */
	@Override
	public void setId(long Id) {
		model.setId(Id);
	}

	/**
	 * Sets the name of this get db.
	 *
	 * @param name the name of this get db
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this get db.
	 *
	 * @param primaryKey the primary key of this get db
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this get db.
	 *
	 * @param uuid the uuid of this get db
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected GetDbWrapper wrap(GetDb getDb) {
		return new GetDbWrapper(getDb);
	}

}