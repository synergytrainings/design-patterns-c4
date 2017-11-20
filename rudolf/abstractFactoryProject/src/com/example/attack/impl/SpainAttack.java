package com.example.attack.impl;

import com.example.attack.AttackLine;

/**
 * @author rudolf.shakhgaldyan on 11/20/2017
 */
public class SpainAttack implements AttackLine {

	public SpainAttack() {
		run();
		shoot();
	}

	@Override
	public void shoot() {
		System.out.println("AttackLine with 3 players," + " touch ball minimum 10 times");
	}

	@Override
	public void run() {
		System.out.println("during attack run slowly ");
	}
}
