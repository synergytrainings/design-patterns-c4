package com.company.builder.model;

import java.util.Map;

import com.company.builder.Query;
import com.company.builder.util.StringBulderHelper;

/**
 * Created by arpine on 12/4/17.
 */
public class DeleteQuery
		implements Query {
	private String table;
	private Map<String, String> wheres;

	public DeleteQuery(String table, Map<String, String> wheres) {
		this.table = table;
		this.wheres = wheres;
	}

	public String execute() {
		StringBuilder sql = new StringBuilder("delete from ");
		sql.append(table);
		sql.append(" where ");
		StringBulderHelper.appendMap(sql, wheres, " and ", " = ");

		return sql.toString();
	}

}
