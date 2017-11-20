package com.example.factory.impl;

import com.example.attack.AttackLine;
import com.example.attack.impl.SpainAttack;
import com.example.defense.DefenseLine;
import com.example.defense.impl.SpainDefense;
import com.example.factory.FormationFactory;
import com.example.midfield.MidfieldLine;
import com.example.midfield.impl.SpainMidfield;

/**
 * @author rudolf.shakhgaldyan on 11/20/2017
 */
public class SpainFormation implements FormationFactory {
	@Override
	public AttackLine createAttack() {
		return new SpainAttack();
	}



	@Override
	public MidfieldLine createMidfield() {
		return new SpainMidfield();
	}

	@Override
	public DefenseLine createDefense() {
		return new SpainDefense();
	}
}
