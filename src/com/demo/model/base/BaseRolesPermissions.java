package com.demo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRolesPermissions<M extends BaseRolesPermissions<M>> extends Model<M> implements IBean {

	public void setRoleId(java.lang.Integer roleId) {
		set("role_id", roleId);
	}

	public java.lang.Integer getRoleId() {
		return get("role_id");
	}

	public void setPermissionId(java.lang.Integer permissionId) {
		set("permission_id", permissionId);
	}

	public java.lang.Integer getPermissionId() {
		return get("permission_id");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
