package com.example.attack.impl;

import com.example.attack.AttackLine;

/**
 * @author rudolf.shakhgaldyan on 11/20/2017
 */
public class ItalyAttack implements AttackLine {

	public ItalyAttack() {
		shoot();
		run();
	}

	@Override
	public void shoot() {
		System.out.println("Attack with 2 players shoot from long distance");
	}

	@Override
	public void run() {
		System.out.println("counter attack quickly");
	}
}
