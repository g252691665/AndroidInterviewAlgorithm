package com.henugao.offer;

/**
 * 面试题31 连续子数组的最大和
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
		int nGreatestSum = -1111111; //表示最小的数
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
