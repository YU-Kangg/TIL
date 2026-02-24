package Bj15649_N과M1;

import java.util.Scanner;

public class Bj15649_0908 {
	static int N, M;
	static int[] arr;
	static boolean[] visited;
	static int[] result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		visited = new boolean[N];
		result = new int[M];

		dfs(0);

	}

	static void dfs(int idx) {
		if (idx == M) {
			for (int a : result) {
				System.out.print(a + " ");
			}
			System.out.println();
			return;

		}

		for (int i = 0; i < N; i++) {
			if (visited[i]) {
				continue;
			}

			result[idx] = i + 1;
			visited[i] = true;
			dfs(idx + 1);
			visited[i] = false;
		}
	}
}
