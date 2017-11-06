package com.company;

import com.company.benefit.Category;
import com.company.benefit.Loader;
import com.company.benefit.SystemCategory;
import com.company.model.Visitable;
import com.company.model.impl.DateFieldImpl;
import com.company.model.impl.ExpressionFieldImpl;
import com.company.model.impl.FieldContainer;
import com.company.model.impl.LookupFieldImpl;

public class Main {

	public static void main(String[] args) {
		FieldContainer fieldContainer = initFieldContainer();

		fieldContainer.loadItems();
		System.out.println();
		fieldContainer.saveItems();

		//One of the visitor pattern's benefits
		//This is because the function overloading on Loader.load(...) is done at compile-time and uses the redPaint systemCategory’s boxed type Category.
		System.out.println();
		System.out.println("--VISITOR PATTERN BENEFIT--");
		Loader loader = new Loader();
		Category category = new Category();
		Category systemCategory = new SystemCategory();
		loader.load(category);
		loader.load(systemCategory);

	}

	private static FieldContainer initFieldContainer() {
		Visitable dateField = new DateFieldImpl(2, "DateField", "yy/mm/dd");
		Visitable lookupField = new LookupFieldImpl(3, "LookupField", 2);
		Visitable expressionField = new ExpressionFieldImpl(4, "ExpressionField", "some_expression");

		FieldContainer fieldContainer = new FieldContainer();
		fieldContainer.addField(dateField);
		fieldContainer.addField(lookupField);
		fieldContainer.addField(expressionField);

		return fieldContainer;
	}

}
