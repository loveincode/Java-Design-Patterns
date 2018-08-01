package com.loveincode.Behavioral.observer;

/**
 * Subject: 目标
 * ConcreteSubject: 具体目标
 * Observer: 观察者
 * oncreteObserver: 具体观察者
 */
public class App {
	
	public static void main(String[] args) {
    	ConcreteSubject concreteSubject = new ConcreteSubject();
        
        Observer userZhang = new oncreteObserver("ZhangSan");
        Observer userLi = new oncreteObserver("LiSi");
        Observer userWang = new oncreteObserver("WangWu");
        
        concreteSubject.attach(userZhang);
        concreteSubject.attach(userLi);
        concreteSubject.attach(userWang);
        concreteSubject.setState(1);
        
        System.out.println("----------------------------------------------");
        concreteSubject.detach(userZhang);
        concreteSubject.setState(2);
        
    }

}
