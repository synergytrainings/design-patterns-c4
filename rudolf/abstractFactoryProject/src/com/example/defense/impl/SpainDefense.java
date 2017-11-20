package com.example.defense.impl;

import com.example.defense.DefenseLine;

/**
 * @author rudolf.shakhgaldyan on 11/20/2017
 */
public class SpainDefense implements DefenseLine {

	public SpainDefense() {
		tackle();
		makeOffside();
	}

	@Override
	public void tackle() {
		System.out.println("Defend with 4 and random make tackles.");
	}

	@Override
	public void makeOffside() {
		System.out.println("Make offside trap when defending with few players");
	}
}
