package com.loveincode.Structural.adapter.inter;

public class ConcreteTarget implements Target{

	@Override
	public void request() {
		System.out.println("Concrete request");
	}

	@Override
	public void specificRequest() {
		System.out.println("Concrete specificRequest");
	}

}
