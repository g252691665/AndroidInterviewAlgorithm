package com.henugao.offer.query;

import java.util.Scanner;

/**
 * 二分查找，前提是有序
 * @author henugao
 *
 */
public class BinarySerach {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查询的数据");
		while(scanner.hasNext()) {
			int key = scanner.nextInt();
			int result = binarySearch(data, key);
			if(result != -1)
				System.out.println("循环实现的二分查找：数据在第" + (result+1) + "个位置");
//			result = recursiveBinarySearch(data, key,0,data.length - 1);
//			if(result != -1)
//				System.out.println("递归实现的二分查找：数据在第" + (result+1) + "个位置");
		
		}
	}
	
	/**
	 * 二分查找 -循环实现
	 * @param data
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] data,int key) {
		if(data == null || data.length <= 0) {
			return -1;
		}
		int low = 0;
		int high = data.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(data[mid] == key){
				return mid;
			}else if(data[mid] > key) {
				high = mid - 1;
			}else if(data[mid] < key) {
				low = mid + 1;
			}
		}
		return -1;
	}
	/**
	 * 二分查找-递归实现
	 * @param data
	 * @param key
	 * @return
	 */
	public static int recursiveBinarySearch(int[] data,int key,int low,int high) {
		if(data == null || data.length <= 0) {
			return -1;
		}
		if(low <= high) {
			int mid = (low + high) / 2;
			if(data[mid] == key)
				return mid;
			else if(data[mid] > key)
				recursiveBinarySearch(data, key, low, mid - 1);
			else if(data[mid] < key) 
				recursiveBinarySearch(data, key, mid + 1, high);
		}
		return -1;
	}

}
