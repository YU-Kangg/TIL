package Bj1697_숨바꼭질;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bj1697_1023 {
	static int N, K;
	static int result, count;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();
		bfs(N);
		System.out.println(result);
	}

	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		visited[start] = true;
		queue.offer(start);

		while (!queue.isEmpty()) {
			int node = queue.poll();
			int[] graph = { node + 1, node - 1, node * 2 };
			for (int next : graph) {
				if (!visited[next]) {d
					visited[next] = true;
					queue.offer(next);
				}
			}
		}
	}
}
