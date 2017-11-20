package com.example.defense.impl;

import com.example.defense.DefenseLine;

/**
 * @author rudolf.shakhgaldyan on 11/20/2017
 */
public class ItalyDefense implements DefenseLine {

	public ItalyDefense() {
		tackle();
		makeOffside();
	}

	@Override
	public void tackle() {
		System.out.println("Defend with 5 players");
	}

	@Override
	public void makeOffside() {
		System.out.println("Never make offsides");
	}
}
