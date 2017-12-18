package com.company.adapter.knowledge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.company.adapter.knowledge.impl.CategoryImpl;
import com.company.adapter.knowledge.impl.CategoryPropertyImpl;

/**
 * Created by arpine on 12/18/17.
 */
public class KnowledgeStore {
	Map<String, Category> categories;

	public KnowledgeStore() {
		if (this.categories == null) {
			initCategories();
		}
	}

	private void initCategories() {
		this.categories = new HashMap();
		CategoryPropertyImpl cat1prop = new CategoryPropertyImpl(Arrays.asList("p1", "p2"));
		CategoryPropertyImpl cat2prop = new CategoryPropertyImpl(Arrays.asList("p1", "p2"));
		this.categories.put("1", new CategoryImpl("Category1", "Column1", cat1prop));
		this.categories.put("2", new CategoryImpl("Category2", "Column2", cat2prop));
	}

	public Map<String, Category> getCategories() {
		return categories;
	}
}
