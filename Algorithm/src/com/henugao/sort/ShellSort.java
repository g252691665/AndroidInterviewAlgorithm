package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * 算法名称：希尔排序
 * 算法思想：复杂的插入排序
 * 算法时间复杂度：最好：不确定，最坏：o(n*logn)，平均：o(n*logn)
 * 算法稳定性：不稳定
 * @author henugao
 *
 */
public class ShellSort {

	/**
	 * 希尔排序
	 * @param arr 要排序的数组arr
	 * @param n   要排序的数组的长度为n
	 */
	public static void shellSort(int arr[],int n) {
		int delta = n / 2;
		while(delta > 0) {
			for(int x = 0; x < delta; x++) {
				for(int i = x + delta; i < n; i += delta) {
					int temp = arr[i];
					int j = i - delta;
					for(; j >= 0 && temp < arr[j];j -= delta) {
						arr[j + delta] = arr[j];
					}
					arr[j + delta] = temp;
					}
			}
			delta = delta / 2;
		}
	}
	public static void main(String[] args) {
		int[] arr = {13,6,3,31,14,27,5,11}; //测试数组
		int n = arr.length;
		shellSort(arr, n);
		PrintArr.printArr(arr);
	}

}
