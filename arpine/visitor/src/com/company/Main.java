package com.company;

import java.util.Arrays;
import java.util.List;

import com.company.benefit.Category;
import com.company.benefit.Loader;
import com.company.benefit.SystemCategory;
import com.company.model.Visitable;
import com.company.model.impl.DateFieldImpl;
import com.company.model.impl.ExpressionFieldImpl;
import com.company.model.impl.LookupFieldImpl;
import com.company.visitor.FieldVisitor;
import com.company.visitor.impl.FieldLoadVisitorImpl;
import com.company.visitor.impl.FieldSaveVisitorImpl;

public class Main {

	public static void main(String[] args) {
		Visitable dateField = new DateFieldImpl(2, "DateField", "yy/mm/dd");
		Visitable lookupField = new LookupFieldImpl(3, "LookupField", 2);
		Visitable expressionField = new ExpressionFieldImpl(4, "ExpressionField", "some_expression");

		List<Visitable> fields = Arrays.asList(dateField, lookupField, expressionField);

		FieldVisitor loadVisitor = new FieldLoadVisitorImpl();
		FieldVisitor saveVisitor = new FieldSaveVisitorImpl();
		System.out.println("--FIELD LOAD VISITOR--");
		fields.forEach(f -> f.accept(loadVisitor));

		System.out.println();
		System.out.println("--FIELD SAVE VISITOR--");
		fields.forEach(f -> f.accept(saveVisitor));

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

}
