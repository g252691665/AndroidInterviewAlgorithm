package com.henugao.offer;


import java.util.Scanner;

/**
 * ������28 �ַ���������
 * 
 * @author henugao
 * 
 */
public class StringPermutation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			char[] ca = str.toCharArray();
			permutation(ca, 0);
		}
	}

	public static void permutation(char[] ca, int begin) {
		if (begin == ca.length - 1) {
			System.out.println(String.valueOf(ca));
		} else {
			for (int i = begin; i < ca.length; i++) {
				if (begin != i && ca[begin] == ca[i])
					continue;
				char temp = ca[begin];
				ca[begin] = ca[i];
				ca[i] = temp;
				
				permutation(ca, begin + 1);

				temp = ca[begin];
				ca[begin] = ca[i];
				ca[i] = temp;
				
			}
		}

	}
}
