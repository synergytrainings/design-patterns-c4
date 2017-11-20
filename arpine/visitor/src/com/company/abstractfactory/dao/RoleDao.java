package com.company.abstractfactory.dao;


import com.company.abstractfactory.model.Role;

/**
 * Created by arpine on 11/19/17.
 */
public interface RoleDao {
	Integer createRole(Role role);

	Role getRoleById(Integer id);
}
