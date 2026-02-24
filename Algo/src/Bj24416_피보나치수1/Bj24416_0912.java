package Bj24416_피보나치수1;

import java.util.Scanner;

public class Bj24416_0912 {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		int[] fib = new int[n+1];
		fib[1] = 1;
		fib[2] = 1;

		int count1 = 0;
		for (int i = 3; i <= n; i++) {
			count1 ++;
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		System.out.println(fib(n) + " " + count1);
	}

	static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
