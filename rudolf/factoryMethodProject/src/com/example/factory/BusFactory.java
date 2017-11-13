package com.example.factory;

import com.example.transport.Bus;
import com.example.transport.Transport;

public class BusFactory extends TransportFactory {
	public Transport create() {
		return new Bus();
	}
}
