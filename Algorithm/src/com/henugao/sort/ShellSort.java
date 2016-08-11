package com.henugao.sort;

import com.henugao.utils.PrintArr;

/**
 * �㷨���ƣ�ϣ������
 * �㷨˼�룺���ӵĲ�������
 * �㷨ʱ�临�Ӷȣ���ã���ȷ�������o(n*logn)��ƽ����o(n*logn)
 * �㷨�ȶ��ԣ����ȶ�
 * @author henugao
 *
 */
public class ShellSort {

	/**
	 * ϣ������
	 * @param arr Ҫ���������arr
	 * @param n   Ҫ���������ĳ���Ϊn
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
		int[] arr = {13,6,3,31,14,27,5,11}; //��������
		int n = arr.length;
		shellSort(arr, n);
		PrintArr.printArr(arr);
	}

}
