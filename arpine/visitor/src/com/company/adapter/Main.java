package com.company.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> accessibleUsers = new ArrayList<>();
		accessibleUsers.add(1);
		Context context = new Context(accessibleUsers, "2", 1);

		CategoryAdaptor categoryAdaptor = new CategoryAdaptor(context, "1");
		System.out.println(categoryAdaptor.toString());
	}

}
