package com.company.builder.model;

import java.util.Map;

import com.company.builder.Query;
import com.company.builder.util.StringBulderHelper;

/**
 * Created by arpine on 12/4/17.
 */
public class UpdateQuery
		implements Query {
	private String table;
	private Map<String, String> values;
	private Map<String, String> wheres;

	public UpdateQuery() {
	}

	public String execute() {
		StringBuilder sql = new StringBuilder("update ");

		sql.append(table);
		sql.append(" set ");

		StringBulderHelper.appendMap(sql, values, " , ", " = ");
		sql.append(" where ");
		StringBulderHelper.appendMap(sql, wheres, " and ", " = ");
		return sql.toString();
	}

	public static UpdateQueryBuilder newUpdateQueryBuilder() {
		return new UpdateQuery().new UpdateQueryBuilder();
	}

	public class UpdateQueryBuilder {
		private UpdateQueryBuilder() {
		}

		public UpdateQueryBuilder setTable(String table) {
			UpdateQuery.this.table = table;

			return this;
		}

		public UpdateQueryBuilder setValues(Map<String, String> values) {
			UpdateQuery.this.values = values;

			return this;
		}

		public UpdateQueryBuilder setWheres(Map<String, String> wheres) {
			UpdateQuery.this.wheres = wheres;

			return this;
		}

		public UpdateQuery build() {
			return UpdateQuery.this;

//			UpdateQuery updateQuery = new UpdateQuery();
//			updateQuery.table = UpdateQuery.this.table;
//			updateQuery.values = UpdateQuery.this.values;
//			updateQuery.wheres = UpdateQuery.this.wheres;
//			return updateQuery;
		}
	}

}
