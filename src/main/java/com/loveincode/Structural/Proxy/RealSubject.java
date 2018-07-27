package com.loveincode.Structural.Proxy;

public class RealSubject implements Subject {

	@Override
	public void sayhello() {
		System.out.println("I am loveincode");
	}

}
