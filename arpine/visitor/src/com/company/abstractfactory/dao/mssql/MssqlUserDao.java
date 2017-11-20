package com.company.abstractfactory.dao.mssql;


import com.company.abstractfactory.dao.UserDao;
import com.company.abstractfactory.model.User;

/**
 * Created by arpine on 11/19/17.
 */
public class MssqlUserDao
		implements UserDao {
	private MssqlDbConnection dbConnection;

	MssqlUserDao(MssqlDbConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public Integer createUser(User user) {
		System.out.println(this.dbConnection.getQueries().get("createUser"));
		return 2;
	}

	public User getUserById(Integer id) {
		System.out.println(this.dbConnection.getQueries().get("loadUserById"));
		return new User("vandam-mssql", "vandam@gmail.com", 28);
	}
}
