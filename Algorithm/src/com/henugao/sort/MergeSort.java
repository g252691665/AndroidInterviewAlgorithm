package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * �㷨���ƣ��鲢�����㷨
 * �㷨˼�룺
 * �㷨ʱ�临�Ӷȣ����o(n*logn) ���o(n*logn) ƽ��o(nlogn)
 * �㷨�ȶ��ԣ��ȶ�
 * @author henugao
 *
 */
public class MergeSort {
	
	public static void mergeSort(int[] arr,int low,int high) {
		if(low < high) {
			int middle = (low + high) / 2;
			mergeSort(arr, low, middle);
			mergeSort(arr, middle + 1, high);
			merge(arr, low, middle, middle + 1, high);
		}
	}
	
	public static void merge(int[] arr,int start1,int end1,int start2,int end2) {
		int temp[] = new int[end2-start1+1];
		int k = 0;
		int i = start1;
		int j = start2;
		while(i <= end1 && j <= end2) {
			if(arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		
		while(i <= end1) {
			temp[k++] = arr[i++];
		}
		while(j <= end2) {
			temp[k++] = arr[j++];
		}
		k = start1;
		for (int m = 0; m < temp.length; m++) {
			arr[k++] = temp[m];
		}
	}

	
	public static void main(String[] args) {
		int[] arr = {13,6,3,31,14,27,5,11}; //��������
		int n = arr.length;
		mergeSort(arr, 0,n - 1);
		PrintArr.printArr(arr);

	}

}
