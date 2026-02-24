package Bj2667_단지번호붙이기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bj2667_0916 {
	static int N;
	static int[][] board;
	static boolean[][] visited;
	static List<Integer> result;

	// 상하좌우
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		board = new int[N][N];
		visited = new boolean[N][N];
		result = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < N; j++) {
				board[i][j] = line.charAt(j) - '0'; // 문자 -> 숫자
			}
		}

		// 모든 위치에서 DFS 시도
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j] && board[i][j] == 1) {
					int size = dfs(i, j);
					result.add(size);
				}
			}
		}

		Collections.sort(result);
		System.out.println(result.size());
		for (int size : result) {
			System.out.println(size);
		}
	}

	// DFS를 수행하고 단지의 크기를 리턴
	static int dfs(int r, int c) {
		visited[r][c] = true;
		int count = 1;

		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];

			if (isValid(nr, nc) && !visited[nr][nc] && board[nr][nc] == 1) {
				count += dfs(nr, nc);
			}
		}

		return count;
	}

	static boolean isValid(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}
}
