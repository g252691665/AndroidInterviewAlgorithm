package com.henugao.offer.data;

/**
 * 面试题10 二进制中1的个数
 * @author henugao
 *
 */
public class NumberOf1InBinary {

	public static void main(String[] args) {

	}
	
	//通过左移的方式
	public static int numberOf1InBinary(int n) {
		int count = 0;
		int flag = 1;
		while(flag != 0) {
			if((flag & n) != 0) 
				count ++;
			flag = flag << 1;
		}
		
		return count;
	}
	
	//把一个整数减去1之后和原来的整数做位与运算，得到结果相当于是把原来的整数的二级制表示中的最右边一个1变成0；
	public static int numberOf1InBinary01(int n) {
		int count = 0;
		while(n != 0) {
			count ++;
			n = n & (n-1);
		}
		return count;
	}
	

}
