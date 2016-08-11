package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * �㷨���ƣ�ֱ�Ӳ��������㷨
 * �㷨˼�룺ÿ�ν�һ��Ԫ�ز���֮ǰ�Ѿ��ź���Ĳ���
 * �㷨ʱ�临�Ӷȣ����o(n) ���o(n^2) ƽ��o(n^2)
 * �㷨�ȶ��ԣ��ȶ�
 * @author henugao
 *
 */

public class InsertSort {
	
	/**
	 * ֱ�Ӳ�������
	 * @param arr Ҫ���������
	 * @param n   Ҫ��������鳤��
	 */
	public static void insertSort(int[] arr,int n) {
		for(int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i -1;
			for(; j >=0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = {13,6,3,31,14,27,5,11}; //��������
		int n = arr.length;
		insertSort(arr, n);
		PrintArr.printArr(arr);

	}

}
