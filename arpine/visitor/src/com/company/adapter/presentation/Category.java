package com.company.adapter.presentation;

import java.util.Map;

/**
 * Created by arpine on 12/18/17.
 */
public interface Category {
	String getId();

	String getName();

	String getColumnName();

	boolean isVisible();

	Map<String, String> getProperties();
}
