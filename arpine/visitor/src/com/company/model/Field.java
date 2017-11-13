package com.company.model;

/**
 * @author arpine on 11/4/17.
 */
public interface Field
		extends BaseObject, Visitable {
	Integer getId();

	String getName();

	Integer getOrderNumber();

	Integer getSortId();

	boolean isDefault();

}
