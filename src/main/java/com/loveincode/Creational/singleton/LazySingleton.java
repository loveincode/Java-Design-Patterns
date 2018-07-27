package com.loveincode.Creational.singleton;

public class LazySingleton {
	
	// 私有构造函数
	private LazySingleton() {
	} 
	
	// 单例对象
	private volatile static LazySingleton instance = null; 
	
	// 静态工厂方法
	public static LazySingleton getInstance() {
		if (instance == null) { // 双重检测机制
			synchronized (LazySingleton.class) { // 同步锁
				if (instance == null) { // 双重检测机制
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}
