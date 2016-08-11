package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * �㷨���ƣ�ð�������㷨
 * �㷨˼�룺
 * �㷨ʱ�临�Ӷȣ����o(n) ���o(n^2) ƽ��o(n^2)
 * �㷨�ȶ��ԣ��ȶ�
 * @author henugao
 *
 */
public class BubbleSort {


	/**
	 * ð������
	 * @param arr Ҫ���������arr
	 * @param n   Ҫ���������arr�ĳ���
	 */
	public static void bubbleSort(int arr[],int n) {
		boolean exchange = true;
		for(int i = 0; i < n-1 && exchange; i++) {
			exchange = false;
			for(int j = 0;j <n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
					exchange = true;
				}
					
			}
		}
	}
	
	public static void swap(int[] arr,int x,int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {13,6,3,31,14,27,5,11}; //��������
		int n = arr.length;
		bubbleSort(arr, n);
		PrintArr.printArr(arr);
	}

}
