package com.company.visitor.impl;

import com.company.model.DateField;
import com.company.model.ExpressionField;
import com.company.model.LookupField;
import com.company.visitor.FieldVisitor;

/**
 * Created by arpine on 11/4/17.
 */
public class FieldLoadVisitorImpl
		implements FieldVisitor {

	@Override
	public void visit(DateField field) {
		System.out.println(String.format("Date field is loaded with %s pattern", field.getPattern()));

	}

	@Override
	public void visit(LookupField field) {
		System.out
				.println(String.format("Lookup field is loaded with %s lookupCategoryId", field.getLookupCategoryId()));

	}

	@Override
	public void visit(ExpressionField field) {
		System.out.println(String.format("Expression field is loaded with %s expression", field.getExpression()));

	}

}
