package Bj4779_칸토어집합;

import java.util.Scanner;

public class Bj4779_0904 {
	static char[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int N = sc.nextInt();

			int t = (int) Math.pow(3, N);

			arr = new char[t];
			for (int i = 0; i < t; i++) {
				arr[i] = '-';
			}

			solve(0, t);

			System.out.println(new String(arr));

		}
	}

	static void solve(int start, int len) {
		if (len == 1) {
			return;
		}

		int newLen = len / 3;

		for (int i = start + newLen; i < start + 2 * newLen; i++) {
			arr[i] = ' ';
		}

		solve(start, newLen);
		solve(start + 2 * newLen, newLen);
	}
}