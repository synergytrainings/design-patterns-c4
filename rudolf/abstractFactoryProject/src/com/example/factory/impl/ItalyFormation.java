package com.example.factory.impl;

import com.example.attack.AttackLine;
import com.example.attack.impl.ItalyAttack;
import com.example.defense.DefenseLine;
import com.example.defense.impl.ItalyDefense;
import com.example.factory.FormationFactory;
import com.example.midfield.MidfieldLine;
import com.example.midfield.impl.ItalyMidfield;

/**
 * @author rudolf.shakhgaldyan on 11/20/2017
 */
public class ItalyFormation implements FormationFactory {
	@Override
	public AttackLine createAttack() {
		return new ItalyAttack();
	}

	@Override
	public MidfieldLine createMidfield() {
		return new ItalyMidfield();
	}

	@Override
	public DefenseLine createDefense() {
		return new ItalyDefense();
	}
}
