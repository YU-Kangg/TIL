package BJ17070_파이프옮기기;

import java.util.Scanner;

public class Bj17070_1028 {
	static int N;
	static int[][] board;
	static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		board = new int[N + 2][N + 2];

		for (int i = 0; i <= N + 1; i++) {
			for (int j = 0; j <= N + 1; j++) {
				if (i == 0 || i == N + 1 || j == 0 || j == N + 1) {
					board[i][j] = 1;
				} else {
					board[i][j] = sc.nextInt();
				}
			}
		}
		count = 0;
		// 시작 지점은 1,1에서 가로방향이므로 1,2,0 시작
		dfs(1, 2, 0);
		System.out.println(count);
	}

	//0 -> 가로, 1 -> 세로, 2 -> 대각
	static void dfs(int r, int c, int status) {
		if (r == N && c == N) {
			count++;
			return;
		}

		switch (status) {
		// 전 상태가 가로 방향일때
		case 0:
			if (isvalid(r, c + 1)) {
				dfs(r, c + 1, 0);
			}
			if (isvalid(r + 1, c + 1) && isvalid(r, c + 1) && isvalid(r + 1, c)) {
				dfs(r + 1, c + 1, 2);
			}
			break;
		// 전 상태가 세로 방향일때
		case 1:
			if (isvalid(r + 1, c)) {
				dfs(r + 1, c, 1);
			}
			if (isvalid(r + 1, c + 1) && isvalid(r, c + 1) && isvalid(r + 1, c)) {
				dfs(r + 1, c + 1, 2);
			}
			break;
		// 전 상태가 대각 방향일때
		case 2:
			if (isvalid(r + 1, c)) {
				dfs(r + 1, c, 1);
			}
			if (isvalid(r + 1, c + 1) && isvalid(r, c + 1) && isvalid(r + 1, c)) {
				dfs(r + 1, c + 1, 2);
			}
			if (isvalid(r, c + 1)) {
				dfs(r, c + 1, 0);
			}
			break;
		}
	}

	static boolean isvalid(int r, int c) {
		return board[r][c] != 1;
	}
}
