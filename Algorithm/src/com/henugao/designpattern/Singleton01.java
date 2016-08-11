package com.henugao.designpattern;

/**
 * ����ʽ����
 * @author henugao
 *
 */
public class Singleton01 {
	private static Singleton01 single = null;
	//�����췽���޶�Ϊprivate�������������ⲿʵ����
	private Singleton01() {
		
	}

	//����1
	public static synchronized Singleton01 getInstance() {
		if(single == null) {
			single = new Singleton01();
		}
		return single;
	}
	
	//����2
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
	
	//����3
	private static  class LazyHolder {
		private static final Singleton01 INSTANCE = new Singleton01();
	}
	
	public static final Singleton01 getInstance02() {
		return LazyHolder.INSTANCE;
	}
	
}
