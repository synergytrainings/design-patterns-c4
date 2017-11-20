package com.company.abstractfactory.dao.oracle;

import com.company.abstractfactory.dao.DaoFactory;
import com.company.abstractfactory.dao.RoleDao;
import com.company.abstractfactory.dao.UserDao;

/**
 * Created by arpine on 11/19/17.
 */
public class OracleDaoFactory
		implements DaoFactory {
	private OracleDbConnection dbConnection;
	private UserDao userDao;
	private RoleDao roleDao;

	public OracleDaoFactory() {
		dbConnection = new OracleDbConnection();
	}

	@Override
	public UserDao createUserDao() {
		if (this.userDao == null) {
			this.userDao = new OracleUserDao(dbConnection);
		}
		return userDao;
	}

	@Override
	public RoleDao createRoleDao() {
		if (this.roleDao == null) {
			roleDao = new OracleRoleDao(dbConnection);
		}
		return roleDao;
	}

}
