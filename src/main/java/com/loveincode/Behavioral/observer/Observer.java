package com.loveincode.Behavioral.observer;
/**
 * Subject: 目标
 * ConcreteSubject: 具体目标
 * Observer: 观察者
 * oncreteObserver: 具体观察者
 */
public interface Observer {
	
	public void update(int state);

}
