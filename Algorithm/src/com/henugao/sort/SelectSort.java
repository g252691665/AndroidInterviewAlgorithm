package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * �㷨���ƣ�ֱ��ѡ������
 * �㷨˼�룺
 * �㷨ʱ�临�Ӷȣ����o(n^2) ���o(n^2) ƽ��o(n^2)
 * �㷨�ȶ��ԣ����ȶ�
 * @author henugao
 *
 */
public class SelectSort {

	
	public static void selectSort(int[] arr,int n) {
		for(int i = 0; i < n-1;i++) {
			int min = i;
			for(int j = i+1;j < n;j++) {
				if(arr[j] < arr[min])
					min = j;
			}
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {13,6,3,31,14,27,5,11}; //��������
		int n = arr.length;
		selectSort(arr, n);
		PrintArr.printArr(arr);

	}

}
