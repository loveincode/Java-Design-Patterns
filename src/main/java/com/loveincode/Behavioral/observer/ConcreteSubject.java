package com.loveincode.Behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

	// 注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
	private List<Observer> list;
	private int state;

	public ConcreteSubject() {
		list = new ArrayList<Observer>();
	}

	@Override
	public void attach(Observer o) {
		list.add(o);
	}

	@Override
	public void detach(Observer o) {
		if (!list.isEmpty())
			list.remove(o);
	}

	// 遍历
	@Override
	public void notifyObserver() {
		for (int i = 0; i < list.size(); i++) {
			Observer oserver = list.get(i);
			oserver.update(getState());
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		System.out.println("目标状态更新： " + state);
		// 消息更新，通知所有观察者
		notifyObserver();
	}

}
