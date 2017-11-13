package com.company.factory;

import com.company.model.impl.Category;

/**
 * author arpine on 11/13/17.
 */
public interface CategoryFactory {
	Category createCategory(String name);
}
