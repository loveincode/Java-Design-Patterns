package com.loveincode.Creational.Factory.Factory_Method;
/**
*
* @author loveincode
* @data 2018年7月27日 下午8:49:30
*/
public class ConcreteFactoryA implements Factory{

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductB();
	}
	
}
