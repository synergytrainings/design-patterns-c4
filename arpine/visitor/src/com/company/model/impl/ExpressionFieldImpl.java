package com.company.model.impl;

import com.company.model.ExpressionField;
import com.company.visitor.FieldVisitor;

/**
 * @author arpine on 11/4/17.
 */
public class ExpressionFieldImpl
		extends BaseObjectImpl
		implements ExpressionField {
	private final String expression;

	public ExpressionFieldImpl(Integer id, String name, String expression) {
		super(id, name);
		this.expression = expression;
	}

	public String getExpression() {
		return expression;
	}

	@Override
	public void accept(FieldVisitor visitor) {
		visitor.visit(this);
	}
}
