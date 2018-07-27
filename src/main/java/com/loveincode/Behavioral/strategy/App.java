package com.loveincode.Behavioral.strategy;

/**
*
* @author loveincode
* @data 2018年7月27日 下午8:27:30
*/
/**
 * 
 * Context: 环境类 Strategy: 抽象策略类 ConcreteStrategy: 具体策略类
 *
 */
public class App {

	public static void main(String[] args) {
		Strategy s1 = new ConcreteStrategyA();
		Context cxt = new Context();
		cxt.setStrategy(s1);
		cxt.algorithm();

		Strategy s2 = new ConcreteStrategyB();
		cxt.setStrategy(s2);
		cxt.algorithm();
	}

}
