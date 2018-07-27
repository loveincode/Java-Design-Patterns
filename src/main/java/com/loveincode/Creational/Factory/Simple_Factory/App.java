package com.loveincode.Creational.Factory.Simple_Factory;
/**
*
* @author loveincode
* @data 2018年7月27日 下午8:43:31
*/
public class App {
	/**
	 * Factory：工厂角色
	 * 工厂角色负责实现创建所有实例的内部逻辑
	 * Product：抽象产品角色
	 * 抽象产品角色是所创建的所有对象的父类，负责描述所有实例所共有的公共接口
	 * ConcreteProduct：具体产品角色
	 * 具体产品角色是创建目标，所有创建的对象都充当这个角色的某个具体类的实例。
	 */
	public static void main(String[] args) {
		Factory factory = Factory.getInstance();
		
		Product productA = factory.createProduct("A");
		Product productB = factory.createProduct("B");
		
		productA.use();
		productB.use();
		
	}

}
