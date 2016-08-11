package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * 算法名称：堆排序算法
 * 算法思想：建堆，调整堆
 * 算法时间复杂度：最好o(n*logn) 最差o(n*logn) 平均o(nlogn)
 * 算法稳定性：不稳定
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
		int[] arr = {13,6,3,31,14,27,5,11}; //测试数组
		int n = arr.length;
		heapSort(arr, n);
		PrintArr.printArr(arr);

	}

}
