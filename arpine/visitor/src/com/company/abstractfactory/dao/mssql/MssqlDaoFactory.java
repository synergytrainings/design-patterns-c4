package com.company.abstractfactory.dao.mssql;


import com.company.abstractfactory.dao.DaoFactory;
import com.company.abstractfactory.dao.RoleDao;
import com.company.abstractfactory.dao.UserDao;

/**
 * Created by arpine on 11/19/17.
 */
public class MssqlDaoFactory
		implements DaoFactory {
	MssqlDbConnection dbConnection;

	public MssqlDaoFactory() {
		dbConnection = new MssqlDbConnection();
	}

	@Override
	public UserDao createUserDao() {
		return new MssqlUserDao(dbConnection);
	}

	@Override
	public RoleDao createRoleDao() {
		return new MssqlRoleDao(dbConnection);
	}

}
