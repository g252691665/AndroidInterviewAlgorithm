package com.henugao.offer.data;

/**
 * ������10 ��������1�ĸ���
 * @author henugao
 *
 */
public class NumberOf1InBinary {

	public static void main(String[] args) {

	}
	
	//ͨ�����Ƶķ�ʽ
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
	
	//��һ��������ȥ1֮���ԭ����������λ�����㣬�õ�����൱���ǰ�ԭ���������Ķ����Ʊ�ʾ�е����ұ�һ��1���0��
	public static int numberOf1InBinary01(int n) {
		int count = 0;
		while(n != 0) {
			count ++;
			n = n & (n-1);
		}
		return count;
	}
	

}
