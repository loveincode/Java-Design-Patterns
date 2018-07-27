package com.loveincode.Behavioral.observer;

public class oncreteObserver implements Observer{

	private String name;
    private int state;
    
    public oncreteObserver(String name) {
        this.name = name;
    }
    
    @Override
    public void update(int state) {
        this.state = state;
        read();
    }
    
    public void read() {
        System.out.println(name + " 得到状态： " + state);
    }
    
    
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
