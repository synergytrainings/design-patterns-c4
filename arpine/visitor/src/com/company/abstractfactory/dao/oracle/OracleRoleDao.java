package com.company.abstractfactory.dao.oracle;


import com.company.abstractfactory.dao.RoleDao;
import com.company.abstractfactory.model.Role;

/**
 * Created by arpine on 11/19/17.
 */
public class OracleRoleDao
		implements RoleDao {
	private OracleDbConnection dbConnection;

	OracleRoleDao(OracleDbConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public Integer createRole(Role role) {
		// TODO: oracle  xml query
		//exec query
		System.out.println(this.dbConnection.getQueries().get("createRole"));
		return 1;
	}

	@Override
	public Role getRoleById(Integer id) {
		System.out.println(this.dbConnection.getQueries().get("loadRoleById"));
		return new Role("Role1 oracle");
	}

}
