package com.henugao.offer.query;

/**
 * ������8 ��ת��������С����
 * 
 * @author henugao
 * 
 */
public class MinNumberInRotatedArray {

	public static void main(String[] args) {

		int [] number = {3,4,5,1,2};
		System.out.println(min(number, number.length));
		int [] number1 = {1,2,3,4,5};
		System.out.println(min(number1, number1.length));
		int [] number2 = {1,0,1,1,1};
		System.out.println(min(number2, number2.length));
	}

	/**
	 * 1.���û����ת�ģ���һ�����־�����С������ 2.������ָ��ָ��������Լ������м��������ͬ��ʱ��
	 * 
	 * @param number
	 * @param len
	 * @return
	 */
	public static int min(int number[], int len) {

		if (number != null && len > 0) {
			int index1 = 0;
			int index2 = len - 1;
			int indexMid = index1; // ��û����תʱ
			while (number[index1] >= number[index2]) {
				if (index2 - index1 == 1) {
					indexMid = index2;
					break;
				}
				indexMid = (index1 + index2) / 2;
				// ������ָ��ָ������ֺ��м��������ͬ��ʱ��ֻ�ܽ���˳�����
				if (number[index1] == number[index2]
						&& number[index1] == number[indexMid]) {
					return minInOrder(number, index1, index2);
				}
				if (number[index1] < number[indexMid]) {
					index1 = indexMid;
				} else if (number[index2] > number[indexMid]) {
					index2 = indexMid;
				}
			}
			return number[indexMid];
		}
		return -1;
	}

	/**
	 * ˳�����
	 * 
	 * @param number
	 * @param index1
	 * @param index2
	 * @return
	 */
	public static int minInOrder(int[] number, int index1, int index2) {
		int min = number[index1];
		for (int i = index1; i <= index2; i++) {
			if (number[i] < min) {
				min = number[i];
			}
		}
		return min;
	}

}
