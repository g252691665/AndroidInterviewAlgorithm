package com.henugao.offer.query;

import java.util.Scanner;

/**
 * ���ֲ��ң�ǰ��������
 * @author henugao
 *
 */
public class BinarySerach {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7};
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ������");
		while(scanner.hasNext()) {
			int key = scanner.nextInt();
			int result = binarySearch(data, key);
			if(result != -1)
				System.out.println("ѭ��ʵ�ֵĶ��ֲ��ң������ڵ�" + (result+1) + "��λ��");
//			result = recursiveBinarySearch(data, key,0,data.length - 1);
//			if(result != -1)
//				System.out.println("�ݹ�ʵ�ֵĶ��ֲ��ң������ڵ�" + (result+1) + "��λ��");
		
		}
	}
	
	/**
	 * ���ֲ��� -ѭ��ʵ��
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
	 * ���ֲ���-�ݹ�ʵ��
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
