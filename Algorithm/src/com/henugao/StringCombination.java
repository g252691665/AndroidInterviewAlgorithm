package com.henugao.offer;

import java.util.Scanner;
import java.util.Stack;

/**
 * 面试题28之扩展 字符串的所有组合 ===暂时没有考虑去重的情况
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
	 * 从一个字符串中选择m个元素
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
