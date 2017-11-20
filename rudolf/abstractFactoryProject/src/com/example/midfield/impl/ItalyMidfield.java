package com.example.midfield.impl;

import com.example.midfield.MidfieldLine;

/**
 * @author rudolf.shakhgaldyan on 11/20/2017
 */
public class ItalyMidfield implements MidfieldLine {

	public ItalyMidfield() {
		pass();
		makeCrosses();
	}

	@Override
	public void pass() {
		System.out.println("stay back like defenders");
	}

	@Override
	public void makeCrosses() {
		System.out.println("always make crosses when it possible");
	}
}
