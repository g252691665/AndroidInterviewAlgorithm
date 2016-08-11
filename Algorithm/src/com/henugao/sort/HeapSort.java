package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * �㷨���ƣ��������㷨
 * �㷨˼�룺���ѣ�������
 * �㷨ʱ�临�Ӷȣ����o(n*logn) ���o(n*logn) ƽ��o(nlogn)
 * �㷨�ȶ��ԣ����ȶ�
 * @author henugao
 *
 */
public class HeapSort {
	
	public static void heapSort(int arr[],int n) {
		for (int i = 0; i < n; i++) {
			buildMaxHeap(arr, n -i - 1);
			swap(arr, 0, n -i - 1);
		}
	}
	public static void buildMaxHeap(int[] arr,int lastIndex) {
		for (int i = (lastIndex -1) / 2 ; i >= 0; i--) {
			int k = i;
			while(2 * k + 1 <= lastIndex) {
				int biggrtIndex = 2 * k + 1;
				if(biggrtIndex < lastIndex) {
					if(arr[biggrtIndex] < arr[biggrtIndex + 1] ) {
						biggrtIndex ++;
					}
				}
				if(arr[k] < arr[biggrtIndex]) {
					swap(arr, k, biggrtIndex);
					k = biggrtIndex;
				}else {
					break;
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
		heapSort(arr, n);
		PrintArr.printArr(arr);

	}

}
