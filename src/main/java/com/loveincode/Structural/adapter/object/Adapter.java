package com.loveincode.Structural.adapter.object;

public class Adapter implements Target {
	
	private Adaptee adaptee;
	
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

	
	@Override
	public void request() {
		System.out.println("request");
	}


	@Override
	public void specificRequest() {
		adaptee.specificRequest();
	}
	
}
