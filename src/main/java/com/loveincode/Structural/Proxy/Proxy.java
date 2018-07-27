package com.loveincode.Structural.Proxy;

/*
 *  Subject: 抽象主题角色
 * 	Proxy: 代理主题角色
 * 	RealSubject: 真实主题角色
 */
public class Proxy implements Subject {

	private RealSubject realSubject;

	public Proxy() {
		this.realSubject = new RealSubject();
	}

	@Override
	public void sayhello() {
		System.out.println("before");
		realSubject.sayhello();
		System.out.println("after");
	}

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.sayhello();
	}

}
