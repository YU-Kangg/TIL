package Bj17135_캐슬디펜스_미완;

import java.util.Scanner;

public class Bj17135_1028 {
	static int N, M, D;
	static int[][] board;
	static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		D = sc.nextInt();

		board = new int[N + 1][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				board[i][j] = sc.nextInt();
			}
		}

	}

	static int dfs(int r, int c, int turn) {
		turn ++;
		if (turn == 5) {
			return count;
		}
		
		
		return -1;
	}

}
