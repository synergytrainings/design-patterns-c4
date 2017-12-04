package com.company.builder.model;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.company.builder.Query;
import com.company.builder.QueryBuilder;
import com.company.builder.util.StringBulderHelper;

/**
 * Created by arpine on 12/4/17.
 */
public class SelectQuery
		implements Query {
	private final String table;
	private final List<String> columns;
	private final List<String> orderBys;
	private final List<String> groupBys;
	private final Map<String, String> wheres;

	public SelectQuery(QueryBuilder queryBuilder) {
		this.table = queryBuilder.getTable();
		this.columns = queryBuilder.getColumns();
		this.orderBys = queryBuilder.getOrderBys();
		this.groupBys = queryBuilder.getGroupBys();
		this.wheres = queryBuilder.getWheres();
	}

	public String execute() {
		StringBuilder sql = new StringBuilder("select ");

		if (columns.size() == 0) {
			sql.append("*");
		}
		else {
			StringBulderHelper.appendList(sql, columns, ", ");
		}

		StringBulderHelper.appendList(sql, Collections.singletonList(table), " from  ", "");
		sql.append(" where ");
		StringBulderHelper.appendMap(sql, wheres, " and ", " = ");
		StringBulderHelper.appendList(sql, groupBys, " group by ", ", ");
		StringBulderHelper.appendList(sql, orderBys, " order by ", ", ");

		return sql.toString();
	}

}
