package com.henugao.designpattern;

/**
 * ����ʽ����
 * @author henugao
 *
 */
public class Singleton02 {
	private Singleton02() {
		
	}
	
	private static final Singleton02 single = new Singleton02();
	
	public static Singleton02 getInstance() {
		return single;
	}

}
