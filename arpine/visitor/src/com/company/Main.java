package com.company;

import java.util.Scanner;

import com.company.model.Field;
import com.company.model.impl.DateFieldImpl;
import com.company.model.impl.ExpressionFieldImpl;
import com.company.model.impl.FieldContainer;
import com.company.model.impl.FieldFactory;
import com.company.model.impl.LookupFieldImpl;
import com.company.model.impl.SystemCategoryFactoryImpl;
import com.company.model.impl.SystemCategoryImpl;
import com.company.model.impl.UserCategoryFactoryImpl;
import com.company.model.impl.UserCategoryImpl;
import com.company.model.util.FieldType;

public class Main {

	public static void main(String[] args) {
		//Factory pattern

		Scanner userInput = new Scanner(System.in);
		Integer fieldTypeInput = null;

		System.out.println("What type of field  ? (1/2/3/4)");

		if (userInput.hasNextLine()) {
			fieldTypeInput = userInput.nextInt();
		}
		FieldType type = FieldType.getById(fieldTypeInput);
		Field field = FieldFactory.createField(type, "TEST_Field");

		System.out.println("--Craeted field order id --");
		System.out.println(field.getOrderNumber());

		UserCategoryFactoryImpl userCategoryFactory = new UserCategoryFactoryImpl("CreatedBY_1");
		UserCategoryImpl userCategory = userCategoryFactory.createCategory("UserCategory");
		System.out.println("--User category info --");
		userCategory.printInfo();

		SystemCategoryFactoryImpl systemCategoryFactory = new SystemCategoryFactoryImpl("SystemType_2");
		SystemCategoryImpl systemCategory = systemCategoryFactory.createCategory("SystemCategory");
		System.out.println();
		System.out.println("--System category info --");
		systemCategory.printInfo();
		visitorExample();
	}

	private static void visitorExample() {
		FieldContainer fieldContainer = initFieldContainer();

		fieldContainer.loadItems();
		System.out.println();
		fieldContainer.saveItems();

		//One of the visitor pattern's benefits
		//This is because the function overloading on Loader.load(...) is done at compile-time and uses the redPaint systemCategory’s boxed type Category.
//		System.out.println();
//		System.out.println("--VISITOR PATTERN BENEFIT--");
//		Loader loader = new Loader();
//		Category category = new Category();
//		Category systemCategory = new SystemCategory();
//		loader.load(category);
//		loader.load(systemCategory);

	}

	private static FieldContainer initFieldContainer() {
		DateFieldImpl dateField = (DateFieldImpl) FieldFactory.createField(FieldType.DATE_AND_TIME, "DateField");
		dateField.setPattern("yy/mm/dd");
		LookupFieldImpl lookupField = (LookupFieldImpl) FieldFactory.createField(FieldType.LOOKUP, "LookupField");
		lookupField.setLookupCategoryId(2);
		ExpressionFieldImpl expressionField = (ExpressionFieldImpl) FieldFactory.createField(FieldType.EXPRESSION,
				"ExpressionField");
		expressionField.setExpression("some expression");

		FieldContainer fieldContainer = new FieldContainer();
		fieldContainer.addField(dateField);
		fieldContainer.addField(lookupField);
		fieldContainer.addField(expressionField);

		return fieldContainer;
	}

}
