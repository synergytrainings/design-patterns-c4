package com.company.builder;

import com.company.builder.model.Connection;

/**
 * Created by arpine on 12/4/17.
 */
public class ConnectionBulder {
	private Connection connection;

	public ConnectionBulder() {
		if (this.connection == null) {
			this.connection = new Connection();
		}
	}

	public ConnectionBulder setConnectionId(String connectionId) {
		this.connection.setConnectionId(connectionId);
		return this;
	}

	public ConnectionBulder setConnectionName(String connectionName) {
		this.connection.setConnectionName(connectionName);
		return this;
	}

	public Connection getConnection() {
		return this.connection;
	}

}
