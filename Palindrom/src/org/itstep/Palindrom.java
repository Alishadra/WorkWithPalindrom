package org.itstep;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Palindrom {

	public static void main(String[] args) {

		System.out.println(getPalindromByChars());

		//System.out.println(getPalindromByDiv());

	}

	private static int getPalindromByDiv() {
		Set<Integer> pList = new HashSet<>();

		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				int res = i * j;
				if (isPalindromByDiv(res)) {
					pList.add(res);
				}
			}
		}

		return Collections.max(pList);
	}

	private static boolean isPalindromByDiv(int res) {
		int checkNum = new Integer(res);
		// iterator
			int lastNum = checkNum % 10;
			
			
		
		
		return true;
	}

	private static int getPalindromByChars() {

		Set<Integer> pList = new HashSet<>();

		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				int res = i * j;
				if (isPalindromByChar(res)) {
					pList.add(res);
				}
			}
		}

		return Collections.max(pList);
	}

	private static boolean isPalindromByChar(int res) {
		int count = String.valueOf(res).length() / 2;
		int lastIndex = String.valueOf(res).length() - 1;

		char[] numbers = String.valueOf(res).toCharArray();

		for (int i = 0; i < count; i++) {
			if (numbers[i] != numbers[lastIndex - i]) {
				return false;
			}
		}
		return true;
	}

}
