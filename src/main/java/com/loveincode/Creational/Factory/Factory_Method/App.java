package com.loveincode.Creational.Factory.Factory_Method;

/**
 *
 * @author loveincode
 * @data 2018年7月27日 下午8:53:16
 */
public class App {
	public static void main(String[] args) {
		Factory factoryA = new ConcreteFactoryA();
		Product productA = factoryA.factoryMethod();
		productA.use();
		Factory factoryB = new ConcreteFactoryB();
		Product productB = factoryB.factoryMethod();
		productB.use();
	}
}
