package com.example.factory;

import com.example.transport.Car;
import com.example.transport.Transport;

public class CarFactory extends TransportFactory {

	public Transport create() {
		return new Car();
	}
}
