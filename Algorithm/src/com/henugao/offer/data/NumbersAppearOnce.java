package com.henugao.offer.data;

/**
 * ������40��������ֻ����һ�ε�����
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
	
	//�ҵ�һ���������ұߵ�һ��Ϊ1�����ڵ�λ��
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
	//�ж������Ķ����ƴ�������indexλ���Ƿ�Ϊ1
	public static boolean isBit1(int num,int index) {
		num = num >> index;
		if((num & 1) == 0) {
			return false;
		}else {
			return true;
		}
	}
	

}
