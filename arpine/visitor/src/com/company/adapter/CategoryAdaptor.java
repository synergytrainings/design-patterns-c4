package com.company.adapter;

import java.util.HashMap;
import java.util.Map;

import com.company.adapter.knowledge.KnowledgeStore;
import com.company.adapter.presentation.Category;

/**
 * Created by arpine on 12/18/17.
 */
public class CategoryAdaptor
		implements Category {
	private com.company.adapter.knowledge.Category category;
	private boolean isVisible;
	private Map<String, String> properties = new HashMap();
	private String id;

	public CategoryAdaptor(Context context, String categoryId) {
		assert (context != null);

		KnowledgeStore knowledgeStore = new KnowledgeStore();
		this.category = knowledgeStore.getCategories().get(categoryId);

		assert (this.category != null);
		this.id = categoryId;
		this.category.getProperty().getValues().forEach(s -> properties.put(s,context.getCurrentLanguageId()));
		this.isVisible = context.getAccessibleUsers().contains(context.getCurrentUserId());
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getName() {
		return this.category.getName();
	}

	@Override
	public String getColumnName() {
		return this.category.getColumnName();
	}

	@Override
	public boolean isVisible() {
		return this.isVisible;
	}

	@Override
	public Map<String, String> getProperties() {
		return properties;
	}

	@Override
	public String toString() {
		return "id: '"
				+ this.getId()
				+ "Name: '"
				+ this.getName()
				+ "ColumnName: '"
				+ this.getColumnName()
				+ "', isvisible: '"
				+ this.isVisible
				+ "', prop: '"
				+ this.getProperties()
				+ "'";

	}
}
