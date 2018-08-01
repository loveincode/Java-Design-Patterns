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

}
