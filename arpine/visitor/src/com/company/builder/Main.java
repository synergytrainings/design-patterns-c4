package com.company.builder;

import java.util.Collections;

import com.company.builder.model.Connection;
import com.company.builder.model.UpdateQuery;
import com.company.builder.util.OperationType;

public class Main {

	public static void main(String[] args) {
		Connection connection = new ConnectionBulder().setConnectionId("ConId")
				.setConnectionName("ConName")
				.getConnection();

		QueryBuilder queryBuilder = new QueryBuilder();
		queryBuilder.operationType(OperationType.SELECT)
				.column("A")
				.column("B")
				.table("Table1")
				.where("A", "aaaa")
				.where("B", "bb")
				.execute();

		queryBuilder.operationType(OperationType.DELETE).table("Table2").where("A", "aaaa").where("B", "bb").execute();

		queryBuilder.operationType(OperationType.UPDATE)
				.table("Table3")
				.values("A", "aaaa")
				.values("B", "bb")
				.where("id", "1")
				.execute();

		UpdateQuery.UpdateQueryBuilder updateQueryBuilder = UpdateQuery.newUpdateQueryBuilder();

		UpdateQuery updateQ1 = updateQueryBuilder.setTable("TableName")
				.setValues(Collections.emptyMap())
				.setWheres(Collections.emptyMap())
				.build();

		System.out.println(updateQ1.execute());

		UpdateQuery updateQuery2 = updateQueryBuilder.setTable("TableName")
				.setValues(Collections.singletonMap("a", "AAA"))
				.setWheres(Collections.emptyMap())
				.build();
		System.out.println(updateQuery2.execute());
		System.out.println(updateQ1.execute());

	}

}
