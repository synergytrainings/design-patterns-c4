package com.example.midfield.impl;

import com.example.midfield.MidfieldLine;

/**
 * @author rudolf.shakhgaldyan on 11/20/2017
 */
public class SpainMidfield implements MidfieldLine {

	public SpainMidfield() {
		pass();
		makeCrosses();
	}

	@Override
	public void pass() {
		System.out.println("Play with 3 midfielders pass the ball to each other every 3 seconds, play tiki taka");
	}

	@Override
	public void makeCrosses() {
		System.out.println("random make crosses to the box");
	}
}
