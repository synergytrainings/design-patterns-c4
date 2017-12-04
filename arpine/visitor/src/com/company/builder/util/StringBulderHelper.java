package com.company.builder.util;

import java.util.List;
import java.util.Map;

/**
 * Created by arpine on 12/4/17.
 */
public class StringBulderHelper {
	public static void appendList(StringBuilder sql, List<String> list, String sep) {
		String prefix = "";
		for (String l : list) {
			sql.append(prefix);
			prefix = sep;
			sql.append(l);
		}
	}

	public static void appendMap(StringBuilder sql, Map<String, String> values, String sep, String operation) {
		String prefix = "";
		for (Map.Entry<String, String> val : values.entrySet()) {
			sql.append(prefix);
			sql.append(val.getKey()).append(operation).append(val.getValue());
			prefix = sep;
		}
	}

	public static void appendList(StringBuilder sql, List<String> list, String sep, String op) {
		if (list.size() == 1) {
			sql.append(sep);
			sql.append(list.get(0));
		}
		else {
			String prefix = "";

			for (String l : list) {
				sql.append(prefix).append(sep);
				prefix = op;

			}
		}
	}
}
