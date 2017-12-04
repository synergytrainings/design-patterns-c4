package com.company.builder.util;

/**
 * @author arpine on 11/13/17.
 */
public enum OperationType {
	SELECT(1),
	UPDATE(2),
	DELETE(3);

	private final Integer id;

	OperationType(Integer id) {
		this.id = id;

	}

	public Integer getId() {
		return id;
	}

	public static OperationType getById(Integer id) {
		for (OperationType e : OperationType.values()) {
			if (e.id.equals(id)) {
				return e;
			}
		}
		throw new IllegalArgumentException(String.format("Enum with value %s is not found.", id));
	}

}
