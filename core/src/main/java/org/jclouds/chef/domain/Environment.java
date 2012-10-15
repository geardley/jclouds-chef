package org.jclouds.chef.domain;

import java.util.Map;

import org.jclouds.domain.JsonBall;

import com.google.common.collect.Maps;
import com.google.gson.annotations.SerializedName;

/**
 * @author geardley
 * 
 */
public class Environment {

	private String name;
	private String description;
	@SerializedName("override_attributes")
	private Map<String, JsonBall> override = Maps.newLinkedHashMap();

	@SerializedName("default_attributes")
	private Map<String, JsonBall> defaultA = Maps.newLinkedHashMap();
	// internal
	@SerializedName("json_class")
	private String _jsonClass = "Chef::Environment";
	@SerializedName("chef_type")
	private String _chefType = "environment";

	// hidden but needs to be here for json deserialization to work
	Environment() {
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, JsonBall> getOverride() {
		return override;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result	+ ((_chefType == null) ? 0 : _chefType.hashCode());
		result = prime * result	+ ((_jsonClass == null) ? 0 : _jsonClass.hashCode());
		result = prime * result	+ ((defaultA == null) ? 0 : defaultA.hashCode());
		result = prime * result	+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result	+ ((override == null) ? 0 : override.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Environment other = (Environment) obj;
		if (_chefType == null) {
			if (other._chefType != null)
				return false;
		} else if (!_chefType.equals(other._chefType))
			return false;
		if (_jsonClass == null) {
			if (other._jsonClass != null)
				return false;
		} else if (!_jsonClass.equals(other._jsonClass))
			return false;
		if (defaultA == null) {
			if (other.defaultA != null)
				return false;
		} else if (!defaultA.equals(other.defaultA))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (override == null) {
			if (other.override != null)
				return false;
		} else if (!override.equals(other.override))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Environment [name=" + name + ", description=" + description
				+ ", override=" + override + ", defaultA=" + defaultA
				+ ", _jsonClass=" + _jsonClass + ", _chefType=" + _chefType
				+ "]";
	}

	public Map<String, JsonBall> getDefaultA() {
		return defaultA;
	}
}
