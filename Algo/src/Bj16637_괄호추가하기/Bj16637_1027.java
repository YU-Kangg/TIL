package Bj16637_괄호추가하기;

import java.util.Scanner;

public class Bj16637_1027 {
	static int N, A, B;
	static int[] num;
	static char[] op;
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		String st = sc.next();
		A = N / 2 + 1;
		B = N / 2;
		num = new int[A];
		op = new char[B];
		for (int i = 0; i < A; i++) {
			num[i] = st.charAt(i * 2) - '0';
		}
		for (int i = 0; i < B; i++) {
			op[i] = st.charAt(i * 2 + 1);
		}
		result = Integer.MIN_VALUE;
		dfs(0, num[0]);
		System.out.println(result);
	}

	static void dfs(int idx, int tmp) {
		if (idx == B) {
			result = Math.max(result, tmp);
			return;
		}
		int b = cal(tmp, num[idx + 1], op[idx]);
		dfs(idx + 1, b);

		if (idx + 1 < B) {
			int a = cal(num[idx + 1], num[idx + 2], op[idx + 1]);
			dfs(idx + 2, cal(tmp, a, op[idx]));
		}

	}

	static int cal(int a, int b, char c) {
		switch (c) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		}
		return -1;
	}
}