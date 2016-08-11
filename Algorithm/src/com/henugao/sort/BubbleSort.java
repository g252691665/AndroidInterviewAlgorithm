package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * 算法名称：冒泡排序算法
 * 算法思想：
 * 算法时间复杂度：最好o(n) 最差o(n^2) 平均o(n^2)
 * 算法稳定性：稳定
 * @author henugao
 *
 */
public class BubbleSort {


	/**
	 * 冒泡排序
	 * @param arr 要排序的数组arr
	 * @param n   要排序的数组arr的长度
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
		int[] arr = {13,6,3,31,14,27,5,11}; //测试数组
		int n = arr.length;
		bubbleSort(arr, n);
		PrintArr.printArr(arr);
	}

}
