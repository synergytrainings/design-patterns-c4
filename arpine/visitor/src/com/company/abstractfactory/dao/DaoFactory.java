package com.company.abstractfactory.dao;

/**
 * Created by arpine on 11/19/17.
 */
public interface DaoFactory {
	UserDao createUserDao();

	RoleDao createRoleDao();

}
