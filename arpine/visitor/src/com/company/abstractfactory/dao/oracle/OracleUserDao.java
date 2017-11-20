package com.company.abstractfactory.dao.oracle;

import com.company.abstractfactory.dao.UserDao;
import com.company.abstractfactory.model.User;

/**
 * Created by arpine on 11/19/17.
 */
public class OracleUserDao
		implements UserDao {
	private OracleDbConnection dbConnection;

	OracleUserDao(OracleDbConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public Integer createUser(User user) {
		System.out.println(this.dbConnection.getQueries().get("createUser"));
		return null;
	}

	public User getUserById(Integer id) {
		System.out.println(this.dbConnection.getQueries().get("loadUserById"));
		return new User("vandam-oracle", "vandam@gmail.com", 28);
	}

}
