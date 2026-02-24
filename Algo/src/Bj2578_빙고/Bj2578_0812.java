package Bj2578_빙고;

import java.util.Scanner;

public class Bj2578_0812 {
	static int N = 5;
	static boolean[][] check = new boolean[N][N];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] board = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int num = sc.nextInt();
				count++;
				for (int k = 0; k < N; k++) {
					for (int l = 0; l < N; l++) {
						if (board[k][l] == num) {
							check[k][l] = true;
						}
					}
				}

				if (countB() >= 3) {
					System.out.println(count);
					return;
				}

			}
		}
	}

	static int countB() {
		int result = 0;

		for (int i = 0; i < 5; i++) {
			boolean line = true;
			for (int j = 0; j < 5; j++) {
				if (!check[i][j]) {
					line = false;
					break;
				}
			}
			if (line) {
				result++;
			}
		}

		for (int i = 0; i < 5; i++) {
			boolean line = true;
			for (int j = 0; j < 5; j++) {
				if (!check[j][i]) {
					line = false;
					break;
				}
			}
			if (line) {
				result++;
			}
		}

		boolean line2 = true;
		for (int i = 0; i < 5; i++) {
			if (!check[i][i]) {
				line2 = false;
				break;
			}
		}
		if (line2) {
			result++;
		}

		boolean line1 = true;
		for (int i = 0; i < 5; i++) {
			if (!check[i][4 - i]) {
				line1 = false;
				break;
			}
		}
		if (line1) {
			result++;
		}

		return result;
	}
}
