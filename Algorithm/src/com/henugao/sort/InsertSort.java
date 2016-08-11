package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * 算法名称：直接插入排序算法
 * 算法思想：每次将一个元素插入之前已经排好序的部分
 * 算法时间复杂度：最好o(n) 最差o(n^2) 平均o(n^2)
 * 算法稳定性：稳定
 * @author henugao
 *
 */

public class InsertSort {
	
	/**
	 * 直接插入排序
	 * @param arr 要排序的数组
	 * @param n   要排序的数组长度
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
		int[] arr = {13,6,3,31,14,27,5,11}; //测试数组
		int n = arr.length;
		insertSort(arr, n);
		PrintArr.printArr(arr);

	}

}
