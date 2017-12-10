package com.example.transports;

import java.util.ArrayList;
import java.util.List;

import com.example.transportparts.trolleybus.*;;

public class Trolleybus extends Transport {
	
	private List<TrolleyRod> trolleyRods;
	
	public Trolleybus(){
		this.trolleyRods = new ArrayList<>();
	}

	public void addRod(TrolleyRod trolleyRod) {
		this.trolleyRods.add(trolleyRod);
	}

}
