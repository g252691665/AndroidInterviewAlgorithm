package com.henugao.offer.query;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 面试题35 第一个只出现一次的字符
 * @author henugao
 *
 */
public class FirstNotRepeatingChar {

	public static void main(String[] args) {
		System.out.println(firstNotRepeatingChar("abaccdeff"));
	}
	
	public static char firstNotRepeatingChar(String str) {
		if(str == null || str.length() <= 0)
			return '#';
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i])) {
				int count = map.get(ch[i]);
				map.remove(ch[i]);
				map.put(ch[i], count++);
			}else {
				map.put(ch[i], 1);
			}
			
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		Iterator<Entry<Character, Integer>> iterator = entrySet.iterator();
		char first = '#';
		while(iterator.hasNext()) {
			Entry<Character, Integer> entry = iterator.next();
			if(entry.getValue() == 1) {
				first = entry.getKey();
				break;
			}
		}
		return first;
		
	}

}
