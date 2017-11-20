package com.company.abstractfactory.dao.mssql;

import com.company.abstractfactory.dao.DbConnection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by arpine on 11/19/17.
 */
public class MssqlDbConnection
		implements DbConnection {

	private final Map<String, String> properties = new HashMap<>();
	private final ConcurrentHashMap<String, String> queries = new ConcurrentHashMap<>();

	public MssqlDbConnection() {
		initProperties();
		initQueries();

	}

	private void initQueries() {
		String queryPath = "/mssql/query";
		//user query path
		this.queries.put("createUser", " Create User MSSQL");
		this.queries.put("createRole", " Create Role  MSSQL");
		this.queries.put("loadUserById", " Load User by id MSSQL");
		this.queries.put("loadRoleById", " Load Role by id MSSQL");
	}

	private void initProperties() {
		properties.put("host", "sis2s006");
		properties.put("user", "user");
		properties.put("password", "password");
	}

	public ConcurrentHashMap<String, String> getQueries() {
		return queries;
	}
}
