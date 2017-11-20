package com.example.factory;

import com.example.attack.AttackLine;
import com.example.defense.DefenseLine;
import com.example.midfield.MidfieldLine;

/**
 * @author rudolf.shakhgaldyan on 11/20/2017
 */
public interface FormationFactory {
	AttackLine createAttack();
	MidfieldLine createMidfield();
	DefenseLine createDefense();
}
