package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * 算法名称：快速排序
 * 算法思想：
 * 算法时间复杂度：最好o(n*logn) 最差o(n^2) 平均o(n*logn)
 * 算法稳定性：不稳定
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
		int[] arr = {13,6,3,31,14,27,5,11}; //测试数组
		int n = arr.length;
		quickSort(arr, 0,n - 1);
		PrintArr.printArr(arr);
	}

}
