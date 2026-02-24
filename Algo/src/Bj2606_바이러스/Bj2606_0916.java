package Bj2606_바이러스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bj2606_0916 {
	static int N, M;
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		list = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
			list[b].add(a); // 양방향
		}

		for (int i = 1; i <= N; i++) {
			Collections.sort(list[i]);
		}

		visited = new boolean[N + 1];
		result = 0;
		dfs(1);
		System.out.println(result);
	}

	static void dfs(int idx) {
		visited[idx] = true;

		for (int next : list[idx]) {
			if (!visited[next]) {
				result++;
				dfs(next);
			}
		}
	}
}
