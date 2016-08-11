package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * �㷨���ƣ���������
 * �㷨˼�룺
 * �㷨ʱ�临�Ӷȣ����o(n*logn) ���o(n^2) ƽ��o(n*logn)
 * �㷨�ȶ��ԣ����ȶ�
 * @author henugao
 *
 */
public class QuickSort {
	
	public static void quickSort(int[] arr,int low,int high) {
		if(low < high) {
			int middle = getMiddle(arr, low, high);
			quickSort(arr, low, middle -1);
			quickSort(arr, middle + 1, high);
		}
	}

	public static int getMiddle(int[] arr,int low,int high) {
		int temp = arr[low];
		while(low < high) {
			while(low < high && arr[high] >= temp) {
				high--;
			}
			arr[low] = arr[high];
			while(low < high && arr[low] <= temp) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = temp;
		return low;
	}
	public static void main(String[] args) {
		int[] arr = {13,6,3,31,14,27,5,11}; //��������
		int n = arr.length;
		quickSort(arr, 0,n - 1);
		PrintArr.printArr(arr);
	}

}
