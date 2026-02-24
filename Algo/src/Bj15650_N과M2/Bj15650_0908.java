package Bj15650_N과M2;

import java.util.Scanner;

public class Bj15650_0908 {
	static int N, M;
	static int[] result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		result = new int[M];

		dfs(0, 1);
	}

	static void dfs(int idx, int sidx) {
		if (idx == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = sidx; i <= N; i++) {
			result[idx] = i;
			dfs(idx + 1, i + 1);
		}
	}
}
