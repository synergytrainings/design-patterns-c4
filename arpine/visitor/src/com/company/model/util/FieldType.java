package com.company.model.util;

/**
 * @author arpine on 11/13/17.
 */
public enum FieldType {
	DATE_AND_TIME(1),
	LOOKUP(2),
	EXPRESSION(3),
	SIMPLE(4);

	private final Integer id;

	FieldType(Integer id) {
		this.id = id;

	}

	public Integer getId() {
		return id;
	}

	public static FieldType getById(Integer id) {
		for (FieldType e : FieldType.values()) {
			if (e.id.equals(id)) {
				return e;
			}
		}
		throw new IllegalArgumentException(String.format("Enum with value %s is not found.", id));
	}

}
