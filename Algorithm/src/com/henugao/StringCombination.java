package com.henugao.offer;

import java.util.Scanner;
import java.util.Stack;

/**
 * ������28֮��չ �ַ������������ ===��ʱû�п���ȥ�ص����
 * 
 * @author henugao
 * 
 */
public class StringCombination {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			char[] ca = str.toCharArray();
			Stack<Character> stack = new Stack<Character>();
			for (int i = 1; i <= ca.length; i++) {
				commbination(ca, 0, i, stack);
			}

		}
	}

	/**
	 * ��һ���ַ�����ѡ��m��Ԫ��
	 * 
	 * @param ca
	 * @param m
	 */
	public static void commbination(char[] ca, int begin, int m,
			Stack<Character> stack) {
		if (m == 0) {
			System.out.println(stack.toString());
			return;
		}

		if (begin == ca.length)
			return;

		stack.push(ca[begin]);
		commbination(ca, begin + 1, m - 1, stack);

		stack.pop();
		commbination(ca, begin + 1, m, stack);

	}


}
