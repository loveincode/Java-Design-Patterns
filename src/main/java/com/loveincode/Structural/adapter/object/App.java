package com.loveincode.Structural.adapter.object;

/*
 *  Target：目标抽象类
	Adapter：适配器类
	Adaptee：适配者类
 */
public class App {

	public static void main(String[] args) {
		Adaptee adaptee  = new Adaptee();
		Target tar = new Adapter(adaptee);
		tar.request();
		tar.specificRequest();
	}

}
