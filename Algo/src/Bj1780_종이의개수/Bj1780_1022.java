package Bj1780_종이의개수;

import java.util.Scanner;

public class Bj1780_1022 {
	static int N;
	static int[][] board;
	static int zero, one, mOne;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		board = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		zero = 0;
		one = 0;
		mOne = 0;
		func(0, 0, N);

		System.out.println(mOne);
		System.out.println(zero);
		System.out.println(one);
	}

	static void func(int x, int y, int size) {
		if (check(x, y, size)) {
			if (board[x][y] == 1) {
				one++;
				return;
			} else if (board[x][y] == 0) {
				zero++;
				return;
			} else {
				mOne++;
				return;
			}
		}

		int newSize = size / 3;
		for (int i = x; i <= x + newSize * 2; i += newSize) {
			for (int j = y; j <= y + newSize * 2; j += newSize) {
				func(i, j, newSize);
			}
		}

	}

	static boolean check(int x, int y, int size) {
		int check = board[x][y];
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (board[i][j] != check) {
					return false;
				}
			}
		}
		return true;
	}
}
