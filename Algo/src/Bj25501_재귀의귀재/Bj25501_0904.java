package Bj25501_재귀의귀재;

import java.util.Scanner;

public class Bj25501_0904 {
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			String st = sc.next();
			count = 0;
			int result = isPalindrome(st);
			System.out.println(result + " " + count);
		}
	
	}

	static int recursion(String s, int l, int r) {
		count ++;
		if (l >= r) {
			return 1;
		} else if (s.charAt(l) != s.charAt(r)) {
			return 0;
		} else {
			return recursion(s, l + 1, r - 1);
		}
	}

	static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}

}
