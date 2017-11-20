package com.company.abstractfactory.dao.oracle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.company.abstractfactory.dao.DbConnection;

/**
 * Created by arpine on 11/19/17.
 */
public class OracleDbConnection
		implements DbConnection {
	private final List<String> properties = new ArrayList<>();
	private final ConcurrentHashMap<String, String> queries = new ConcurrentHashMap<>();

	public OracleDbConnection() {
		initProperties();
		initQueries();

	}

	private void initQueries() {
		String queryPath = "/oracle/query";

		//user query path
		this.queries.put("createUser", " Create User Oracle");
		this.queries.put("createRole", " Create Role  Oracle");
		this.queries.put("loadUserById", " Load User by id Oracle");
		this.queries.put("loadRoleById", " Load Role by id Oracle");
	}

	private void initProperties() {
		properties.add("prop1");
		properties.add("prop2");
	}

	public ConcurrentHashMap<String, String> getQueries() {
		return queries;
	}
}
