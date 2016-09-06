package com.henugao.offer;

/**
 * ������31 ���������������
 * @author henugao
 *
 */
public class GreatesSumOfSubarrays {

	public static void main(String[] args) {

	}
	
	public int findGreatestSumOfSubArray(int[] arr,int length) {
		if(arr == null || length < 0) {
			return 0;
		}
		int nCurrentSum = 0;
		int nGreatestSum = -1111111; //��ʾ��С����
		for (int i = 0; i < arr.length; i++) {
			if(nCurrentSum < 0) {
				nCurrentSum = arr[i];
			}else {
				nCurrentSum += arr[i];
			}
			if(nCurrentSum > nGreatestSum) {
				nGreatestSum = nCurrentSum;
			}
		}
		return nGreatestSum;
	}

}
