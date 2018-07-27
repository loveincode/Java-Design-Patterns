package com.loveincode.Creational.Factory.Simple_Factory;
/**
*
* @author loveincode
* @data 2018年7月27日 下午8:36:51
*/
public class Factory {
	
    private final static Factory instance = new Factory();

    public static Factory getInstance() {
        return instance;
    }
	
	public Product createProduct(String arg){
		Product product = null;
		if(arg.equals("A")){
			product = new ConcreteProductA();
		}else if(arg.equals("B")){
			product = new ConcreteProductB();
		}
		return product;
	}

}
