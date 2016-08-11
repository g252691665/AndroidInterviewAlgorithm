package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * 算法名称：直接选择排序
 * 算法思想：
 * 算法时间复杂度：最好o(n^2) 最差o(n^2) 平均o(n^2)
 * 算法稳定性：不稳定
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
		int[] arr = {13,6,3,31,14,27,5,11}; //测试数组
		int n = arr.length;
		selectSort(arr, n);
		PrintArr.printArr(arr);

	}

}
