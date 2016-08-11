package com.henugao.designpattern;

/**
 * 懒汉式单例
 * @author henugao
 *
 */
public class Singleton01 {
	private static Singleton01 single = null;
	//将构造方法限定为private，避免了类在外部实例化
	private Singleton01() {
		
	}

	//方法1
	public static synchronized Singleton01 getInstance() {
		if(single == null) {
			single = new Singleton01();
		}
		return single;
	}
	
	//方法2
	public static Singleton01 getInstance01() {
		if(single == null) {
			synchronized (Singleton01.class) {
				if(single == null) {
					single = new Singleton01();
				}
			}
		}
		return single;
	}
	
	//方法3
	private static  class LazyHolder {
		private static final Singleton01 INSTANCE = new Singleton01();
	}
	
	public static final Singleton01 getInstance02() {
		return LazyHolder.INSTANCE;
	}
	
}
