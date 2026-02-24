package Bj14888_연산자끼워넣기;

import java.util.Scanner;

public class Bj14888_0908 {
	static int N;
	static int[] arr;
	static int[] op;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		// 0 -> +, 1 -> -, 2 -> x, 3-> /
		op = new int[4];
		for (int i = 0; i < 4; i++) {
			op[i] = sc.nextInt();
		}
		dfs(1, arr[0]);
		
		System.out.println(max + "\n" + min);

	}

	static void dfs(int idx, int current) {
		if (idx == N) {
			max = Math.max(max, current);
			min = Math.min(min, current);
			return;
		}
		if (op[0] > 0) { // +
			op[0]--;
			dfs(idx + 1, current + arr[idx]);
			op[0]++;
		}
		if (op[1] > 0) { // -
			op[1]--;
			dfs(idx + 1, current - arr[idx]);
			op[1]++;
		}
		if (op[2] > 0) { // *
			op[2]--;
			dfs(idx + 1, current * arr[idx]);
			op[2]++;
		}
		if (op[3] > 0) { // /
			op[3]--;
			int next;
			if (current < 0) {
				next = -(Math.abs(current) / arr[idx]);
			} else {
				next = current / arr[idx];
			}
			dfs(idx + 1, next);
			op[3]++;
		}
	}
}