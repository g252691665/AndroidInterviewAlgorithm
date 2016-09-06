package com.henugao.offer;

/**
 * 数组中出现次数超过一半的数字
 * @author henugao
 *
 */
public class MoreThanHalfNumber {
	public static void main(String[] args) {

	}
	
	public static int moreThanHalfNumber(int arr[],int len) {
		if(arr == null || len <= 0)
			return 0;
		int result = arr[0];
		int time = 1;
		for (int i = 1; i < arr.length; i++) {
			if(time == 0) {
				result = arr[i];
				time = 1;
			}else if(result == arr[i])
				time ++;
			else 
				time --;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == result) {
				count ++;
			}
		}
		if(2*count <= len)
			return 0;
		return result;
	}

}
