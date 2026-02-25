package Bj17471_게리맨더링;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Bj17471 {
	static ArrayList<Integer>[] graph;
	static boolean[] status;
	static int N;
	static int[] person;
	static int result = Integer.MAX_VALUE;
	static int tmp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 구역의 개수 N
		N = sc.nextInt();
		// 구역의 인구수
		person = new int[N];
		for (int i = 0; i < N; i++) {
			person[i] = sc.nextInt();
		}
		
		// 구역
		graph = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for (int i = 1; i <= N; i++) {
			int amd = sc.nextInt();
			for (int j = 0; j < amd; j++) {
				int ar = sc.nextInt();
				graph[i].add(ar);
				graph[ar].add(i);
			}
		}
		// 결과 임시 저장값
		tmp = 0;
		// 구역 A, B 상태값
		status = new boolean[N + 1];
		func(1);

		System.out.println((result == Integer.MAX_VALUE) ? "-1" : result);
	}
	// 모든 경우의 수 돌려가며 최소값 찾기
	static void func(int idx) {
		if (idx == N + 1) {
			if (isvalid()) {
				result = Math.min(tmp, result);
				return;
			}
			return;
		}

		status[idx] = true;
		func(idx + 1);
		status[idx] = false;
		func(idx + 1);

	}
	// 연결이 가능한지 확인(BFS)
	static boolean isConnect(List<Integer> list) {
		boolean[] visited = new boolean[N + 1];
		Queue<Integer> q = new LinkedList<>();

		int startNode = list.get(0);
		q.add(startNode);
		visited[startNode] = true;
		int count = 1;

		while (!q.isEmpty()) {
			int curr = q.poll();

			for (int next : graph[curr]) {
				if (list.contains(next) && !visited[next]) {
					visited[next] = true;
					q.add(next);
					count++;
				}
			}
		}
		return count == list.size();
	}
	// A, B 가 둘다 연결되어있는지 확인
	static boolean isvalid() {
		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>();
		for (int i = 1; i < N + 1; i++) {
			if (status[i]) {
				A.add(i);
			} else {
				B.add(i);
			}
		}
		if (A.isEmpty() || B.isEmpty()) {
			return false;
		}

		boolean aIsOk = isConnect(A);
		boolean bIsOk = isConnect(B);

		if (bIsOk && aIsOk) {
			cal(A, B);
			return true;
		} else {
			return false;
		}

	}
	// 인구 수 차이 계산기
	static void cal(List<Integer> A, List<Integer> B) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < A.size(); i++) {
			a += person[A.get(i) - 1];
		}

		for (int i = 0; i < B.size(); i++) {
			b += person[B.get(i) - 1];
		}
		tmp = Math.abs(a - b);
	}
}