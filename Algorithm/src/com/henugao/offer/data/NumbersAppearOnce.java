package com.henugao.offer.data;

/**
 * 面试题40：数组中只出现一次的数字
 * @author henugao
 *
 */
public class NumbersAppearOnce {

	public static void main(String[] args) {

	}
	
	public static void findNumAppearOnce(int array[],int num1[],int num2[]) {
		if(array == null )
			return;
		int len = array.length;
		int resultExclusiveOR = 0;
		for(int i = 0;i < len;i++) 
			resultExclusiveOR ^= array[i];
		int index = findFirstBit1(resultExclusiveOR);
		int start1 = 0;
		int start2 = 0;
		for (int i = 0; i < len; i++) {
			if(isBit1(array[i], index)) {
				num1[start1] = array[i];
				start1 ++;
			}else {
				num2[start2] = array[i];
				start2 ++;
			}
						
		}
		
	}
	
	//找到一个整数中右边第一个为1的所在的位置
	public static int findFirstBit1(int num) {
		int count =0;
		int flag = 1;
		while( flag != 0) {
			if((num & flag) != 0) {
				break;
			}
			
			flag  = flag << 1;
			count ++;
		}
		return count;
	}
	//判断整数的二进制从右数第index位置是否为1
	public static boolean isBit1(int num,int index) {
		num = num >> index;
		if((num & 1) == 0) {
			return false;
		}else {
			return true;
		}
	}
	

}
