package com.company.model.impl;

import com.company.model.Field;
import com.company.model.util.FieldType;

/**
 * @author arpine on 11/13/17.
 */
public class FieldFactory {
	public static Field createField(FieldType fieldType, String fieldName) {
		FieldImpl field = null;
		Integer id = (int) Math.random();
		switch (fieldType) {
			case SIMPLE:
				field = new FieldImpl(id, fieldName);
				field.setOrderNumber(4);
				break;
			case DATE_AND_TIME:
				field = new DateFieldImpl(id, fieldName);
				field.setOrderNumber(1);
				break;
			case LOOKUP:
				field = new LookupFieldImpl(id, fieldName);
				field.setOrderNumber(2);

				break;
			case EXPRESSION:
				field = new ExpressionFieldImpl(id, fieldName);
				field.setOrderNumber(3);
				break;
			default:
				throw new IllegalArgumentException(String.format("creator for type %s is not implemented.", id));
		}
		return field;
	}

}
