package com.example.builders;

import com.example.transportparts.Body;
import com.example.transportparts.Engine;
import com.example.transportparts.Headlight;
import com.example.transportparts.Wheel;
import com.example.transports.Transport;

public abstract class TransportBuilder {
	
	public abstract Wheel buildWheel();
	public abstract Body buildBody();
	public abstract Headlight buildHeadLight();
	public abstract Engine buildEngine();
	public abstract Transport getTransport();

}
