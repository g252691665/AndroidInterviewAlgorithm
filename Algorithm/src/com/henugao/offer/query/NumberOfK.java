package com.henugao.offer.query;

/**
 * 面试题38 数字在排序数组中出现的次数
 * 
 * @author henugao
 * 
 */
public class NumberOfK {

	public static void main(String[] args) {
		int data[] = { 1, 2, 3, 3, 3, 3, 4, 5 };
		int first = getFirstK(data, 3, 0, data.length - 1);
		int last = getLastK(data, 3, 0, data.length - 1);
		if (first > -1 && last > -1) {
			System.out.println(last - first + 1);
		}

	}

	// 得到数字在数组中出现的第一个位置
	public static int getFirstK(int[] data, int k, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (data[mid] == k) {
				if (mid == 0 || (mid > 0 && data[mid - 1] != k)) {
					return mid;
				} else {
					high = mid - 1;
				}
			} else if (data[mid] > k) {
				high = mid - 1;
			} else if (data[mid] < k) {
				low = mid + 1;
			}

			return getFirstK(data, k, low, high);

		}
		return -1;
	}

	// 得到数字在数组中出现的最后一个位置
	public static int getLastK(int[] data, int k, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			int len = data.length;
			if (data[mid] == k) {
				if ((mid == len - 1) || (mid < len - 1 && data[mid + 1] != k)) {
					return mid;
				} else {
					low = mid + 1;
				}
			} else if (data[mid] > k) {
				high = mid - 1;
			} else if (data[mid] < k) {
				low = mid + 1;
			}
			return getLastK(data, k, low, high);
		}
		return -1;
	}

}
