package com.company.model.impl;

import java.util.ArrayList;
import java.util.List;

import com.company.model.Visitable;
import com.company.visitor.impl.FieldLoadVisitorImpl;
import com.company.visitor.impl.FieldSaveVisitorImpl;

/**
 * @author arpine on 11/6/17.
 */
public class FieldContainer {
	private List<Visitable> fields = new ArrayList<>();

	public void addField(Visitable field) {
		this.fields.add(field);
	}

	public List<Visitable> loadItems() {
		FieldLoadVisitorImpl loadVisitor = new FieldLoadVisitorImpl();
		System.out.println("--FIELD LOAD VISITOR--");
		fields.forEach(f -> f.accept(loadVisitor));
		return fields;
	}

	public void saveItems() {
		FieldSaveVisitorImpl saveVisitor = new FieldSaveVisitorImpl();
		System.out.println("--FIELD SAVE VISITOR--");
		fields.forEach(f -> f.accept(saveVisitor));
	}
}
