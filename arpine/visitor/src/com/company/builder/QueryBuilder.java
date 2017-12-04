package com.company.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.company.builder.model.DeleteQuery;
import com.company.builder.model.SelectQuery;
import com.company.builder.model.UpdateQuery;
import com.company.builder.util.OperationType;

/**
 * Created by arpine on 12/4/17.
 */
public class QueryBuilder {
	private String table;
	private List<String> columns = new ArrayList<>();
	private List<String> orderBys = new ArrayList<>();
	private List<String> groupBys = new ArrayList<>();
	private Map<String, String> wheres = new HashMap<>();
	private Map<String, String> values = new HashMap();
	private OperationType operationType;

	public QueryBuilder() {
	}

	public QueryBuilder table(String table) {
		this.table = table;
		return this;
	}

	public QueryBuilder operationType(OperationType operationType) {
		this.operationType = operationType;
		return this;
	}

	public QueryBuilder groupBy(String groupBy) {
		groupBys.add(groupBy);
		return this;
	}

	public QueryBuilder orderBy(String orderBy) {
		orderBys.add(orderBy);
		return this;
	}

	public QueryBuilder column(String name) {
		columns.add(name);
		return this;
	}

	public QueryBuilder where(String column, String value) {
		wheres.put(column, value);
		return this;
	}

	public QueryBuilder values(String column, String value) {
		values.put(column, value);
		return this;
	}

	public void execute() {
		if (this.operationType == null) {
			throw new IllegalArgumentException(String.format("Unknown operation type"));
		}

		if (this.table == null) {
			throw new IllegalArgumentException(String.format("Unknown Table"));

		}

		Query query;
		switch (operationType) {
			case SELECT:
				query = new SelectQuery(this);
				break;
			case UPDATE:
				query = UpdateQuery.newUpdateQueryBuilder().setTable(table).setValues(values).setWheres(wheres).build();
				break;
			case DELETE:
				query = new DeleteQuery(this.table, this.wheres);
				break;
			default:
				throw new IllegalArgumentException(
						String.format("creator for type %s is not implemented.", operationType));
		}
		System.out.println(query.execute());
	}

	public String getTable() {
		return table;
	}

	public List<String> getColumns() {
		return columns;
	}

	public List<String> getOrderBys() {
		return orderBys;
	}

	public List<String> getGroupBys() {
		return groupBys;
	}

	public Map<String, String> getWheres() {
		return wheres;
	}

	public Map<String, String> getValues() {
		return values;
	}
}
