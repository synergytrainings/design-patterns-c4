package com.example.transports;

import java.util.ArrayList;
import java.util.List;

import com.example.transportparts.trolleybus.*;;

public class Trolleybus extends Transport {
	
	private List<TrolleyRod> trolleybusShtangeq;
	
	public Trolleybus(){
		this.trolleybusShtangeq = new ArrayList<>();
	}

	public void addShtanga(TrolleyRod trolleybusShtanga) {
		this.trolleybusShtangeq.add(trolleybusShtanga);
	}

}
