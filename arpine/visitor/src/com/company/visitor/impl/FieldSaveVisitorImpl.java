package com.company.visitor.impl;

import com.company.model.DateField;
import com.company.model.ExpressionField;
import com.company.model.LookupField;
import com.company.visitor.FieldVisitor;

/**
 * @author by arpine on 11/4/17.
 */
public class FieldSaveVisitorImpl
		implements FieldVisitor {

	@Override
	public void visit(DateField field) {
		System.out.println(String.format("Date field is saved with %s pattern", field.getPattern()));

	}

	@Override
	public void visit(LookupField field) {
		System.out
				.println(String.format("Lookup field is saved with %s lookupCategoryId", field.getLookupCategoryId()));

	}

	@Override
	public void visit(ExpressionField field) {
		System.out.println(String.format("Expression field is saved with %s expression", field.getExpression()));

	}
}
