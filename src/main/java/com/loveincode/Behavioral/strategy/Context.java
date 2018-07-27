package com.loveincode.Behavioral.strategy;
/**
*
* @author loveincode
* @data 2018年7月27日 下午8:22:07
*/
public class Context implements Strategy{
	private Strategy strategy;
	
	@Override
	public void algorithm() {
		strategy.algorithm();
	}
	
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}

}
