package com.company.abstractfactory.dao.mssql;

import com.company.abstractfactory.dao.DaoFactory;
import com.company.abstractfactory.dao.RoleDao;
import com.company.abstractfactory.dao.UserDao;

/**
 * Created by arpine on 11/19/17.
 */
public class MssqlDaoFactory
		implements DaoFactory {
	private MssqlDbConnection dbConnection;
	private UserDao userDao;
	private RoleDao roleDao;

	public MssqlDaoFactory() {
		dbConnection = new MssqlDbConnection();
	}

	@Override
	public UserDao createUserDao() {
		if (this.userDao == null) {
			userDao = new MssqlUserDao(dbConnection);
		}
		return this.userDao;
	}

	@Override
	public RoleDao createRoleDao() {
		if (this.roleDao == null) {
			roleDao = new MssqlRoleDao(dbConnection);
		}
		return roleDao;
	}

}
