package com.company.abstractfactory;

import com.company.abstractfactory.dao.DaoFactory;
import com.company.abstractfactory.dao.RoleDao;
import com.company.abstractfactory.dao.UserDao;
import com.company.abstractfactory.dao.mssql.MssqlDaoFactory;
import com.company.abstractfactory.dao.oracle.OracleDaoFactory;
import com.company.abstractfactory.model.Role;
import com.company.abstractfactory.model.User;

public class Main {

	public static void main(String[] args) {
		System.out.println(getUserByFactory(new MssqlDaoFactory()).getUsername());
		System.out.println(getUserByFactory(new OracleDaoFactory()).getUsername());

		System.out.println(getRoleByFactory(new MssqlDaoFactory()).getName());
		System.out.println(getRoleByFactory(new OracleDaoFactory()).getName());
	}

	static User getUserByFactory(DaoFactory factory) {
		UserDao userDao = factory.createUserDao();

		User user = userDao.getUserById(89);

		return user;
	}

	static Role getRoleByFactory(DaoFactory factory) {
		RoleDao roleDao = factory.createRoleDao();

		Role role = roleDao.getRoleById(89);

		return role;
	}
}
