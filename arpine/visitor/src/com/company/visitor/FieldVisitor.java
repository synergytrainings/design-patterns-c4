package com.company.visitor;

import com.company.model.DateField;
import com.company.model.ExpressionField;
import com.company.model.LookupField;

/**
 * @author arpine on 11/4/17.
 */
public interface FieldVisitor {
	void visit(DateField field);

	void visit(LookupField field);

	void visit(ExpressionField field);
}
