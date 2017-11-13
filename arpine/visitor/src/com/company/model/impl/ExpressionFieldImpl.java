package com.company.model.impl;

import com.company.model.ExpressionField;
import com.company.model.util.FieldType;
import com.company.visitor.FieldVisitor;

/**
 * @author arpine on 11/4/17.
 */
public class ExpressionFieldImpl
		extends FieldImpl
		implements ExpressionField {
	private String expression;

	ExpressionFieldImpl(Integer id, String name) {
		this(id, name, null);
	}

	ExpressionFieldImpl(Integer id, String name, String expression) {
		super(id, name);
		this.expression = expression;
		setFieldType(FieldType.EXPRESSION);
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public void accept(FieldVisitor visitor) {
		visitor.visit(this);
	}
}
