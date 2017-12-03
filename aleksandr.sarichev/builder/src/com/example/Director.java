package com.example;

import com.example.builders.TransportBuilder;
import com.example.transports.Transport;

public class Director {
	
	public Transport build(TransportBuilder transportBuilder){
		transportBuilder.buildBody();
		transportBuilder.buildEngine();
		for(int i = 0; i < 4; i++){
			transportBuilder.buildHeadLight();
			transportBuilder.buildWheel();
		}
		return transportBuilder.getTransport();
	}

}
