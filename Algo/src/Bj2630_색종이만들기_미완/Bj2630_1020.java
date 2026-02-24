package Bj2630_색종이만들기_미완;

import java.util.Scanner;

public class Bj2630_1020 {
	static int N;
	static int[][] board;
	static int blue, white;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		board = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		blue = 0;
		white = 0;
		func(0, 0, N);
		System.out.println(white);
		System.out.println(blue);
	}

	static void func(int x, int y, int size) {
		if (check(x, y, size)) {
			if (board[x][y] == 1) {
				blue++;
			} else {
				white++;
			}
			return;
		}

		int newSize = size / 2;
		func(x, y, newSize);
		func(x, y + newSize, newSize);
		func(x + newSize, y, newSize);
		func(x + newSize, y + newSize, newSize);
	}

	static boolean check(int x, int y, int size) {
		int recent = board[x][y];
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (board[i][j] != recent) {
					return false;
				}
			}
		}
		return true;
	}
}
