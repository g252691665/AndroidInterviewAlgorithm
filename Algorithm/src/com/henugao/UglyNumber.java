package com.henugao.offer;

/**
 * ÃæÊÔÌâ34 ³óÊı
 * @author henugao
 *
 */
public class UglyNumber {
	public static void main(String[] args) {

	}
	
	public static int getUglyNumber(int index) {
		if(index < 0)
			return 0;
		int[] pUglyNumbers = new int[index];
		int pNextIndex = 1;
		pUglyNumbers[0] = 1;
		
		int pMultiUgly2 = 0;
		int pMultiUgly3 = 0;
		int pMultiUgly5 = 0;
		
		while(pNextIndex < index) {
			int min = min(pUglyNumbers[pMultiUgly2] * 2, pUglyNumbers[pMultiUgly2] * 3, pUglyNumbers[pMultiUgly2] * 5);
			pUglyNumbers[pNextIndex] = min;
			
			while(pUglyNumbers[pMultiUgly2] * 2 < pUglyNumbers[pNextIndex]) {
				pMultiUgly2 ++;
			}
			while(pUglyNumbers[pMultiUgly3] * 3 < pUglyNumbers[pNextIndex]) {
				pMultiUgly3 ++;
			}
			while(pUglyNumbers[pMultiUgly5] * 5 < pUglyNumbers[pNextIndex]) {
				pMultiUgly5 ++;
			}
			
		}
		
		int ugly = pUglyNumbers[pNextIndex - 1];
		return ugly;
	}

	
	public static int min(int number1,int number2,int number3) {
		int min = number1 < number2 ? number1 : number2;
		min = min < number3 ? min : number3;
		return min;
	}
}
