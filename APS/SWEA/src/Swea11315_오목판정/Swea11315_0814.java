package Swea11315_오목판정;

import java.util.Scanner;

public class Swea11315_0814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			String[] b = new String[N];
			for (int i = 0; i < N; i++) {
				b[i] = sc.next();
			}

			boolean[][] board = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (b[i].charAt(j) == 'o') {
						board[i][j] = true;
					}
				}
			}

			boolean status = false;

			// 가로방향 검사
			for (int i = 0; i < N; i++) {
				int count = 0;
				for (int j = 0; j < N; j++) {
					if (board[i][j]) {
						count++;
					}
				}
				if (count == 5) {
					status = true;
					break;
				}
			}

			// 세로방향 검사
			for (int i = 0; i < N; i++) {
				int count = 0;
				for (int j = 0; j < N; j++) {
					if (board[j][i]) {
						count++;
					}
				}
				if (count == 5) {
					status = true;
					break;
				}
			}

			// 대각방향 검사
			int count1 = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (board[i][i+j]) {
						count1++;
					}
					if (count1 >= 5) {
						status = true;
						break;
					}
				}
			}

			// 대각방향 검사
			int count2 = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (board[i][N - 1 - i]) {
						count2++;
					}
					if (count2 == 5) {
						status = true;
						break;
					}
				}
			}

			System.out.println(status ? "#" + tc + " YES" : "#" + tc + " NO");
		}

	}
}
