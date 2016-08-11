package com.henugao.offer.data;

/**
 * ������9 쳲���������
 * @author henugao
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
	

	}
	
	/**
	 * �ݹ�ķ���ʵ��쳲���������
	 * @param n
	 * @return
	 */
	public long fibnacci01(int n) {
		if(n <= 0)
			return 0;
		if(n == 1)
			return 1;
		return fibnacci01(n-1) + fibnacci01(n-2);
	}
	/**
	 * ѭ������ʵ��쳲���������
	 * @param n
	 * @return
	 */
	public long fibnacci02(int n) {
		int result[] = {0,1};
		if(n < 2) 
			return result[n];
		
		long fibNMinusOne = 1;
		long fibNMinusTwo = 0;
		long fibN = 0;
		for(int i = 2; i < n;i++) {
			fibN = fibNMinusOne + fibNMinusTwo;
			
			fibNMinusTwo = fibNMinusOne;
			fibNMinusOne = fibN;
		}
		
		return fibN;
	}
	
	 

}
