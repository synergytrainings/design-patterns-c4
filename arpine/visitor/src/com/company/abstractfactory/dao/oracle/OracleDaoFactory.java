package com.company.abstractfactory.dao.oracle;


import com.company.abstractfactory.dao.DaoFactory;
import com.company.abstractfactory.dao.RoleDao;
import com.company.abstractfactory.dao.UserDao;

/**
 * Created by arpine on 11/19/17.
 */
public class OracleDaoFactory
		implements DaoFactory {
	OracleDbConnection dbConnection;

	public OracleDaoFactory() {
		dbConnection = new OracleDbConnection();
	}

	@Override
	public UserDao createUserDao() {
		return new OracleUserDao(dbConnection);
	}

	@Override
	public RoleDao createRoleDao() {
		return new OracleRoleDao(dbConnection);
	}

}
