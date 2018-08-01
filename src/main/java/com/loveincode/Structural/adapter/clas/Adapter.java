package com.loveincode.Structural.adapter.clas;

public class Adapter extends Adaptee implements Target {
	
	@Override
	public void request() {
		System.out.println("request");
	}
	
}
