package com.company.model;

import com.company.visitor.FieldVisitor;

/**
 * @author arpine on 11/4/17.
 */
public interface Visitable {
	void accept(FieldVisitor visitor);
}
