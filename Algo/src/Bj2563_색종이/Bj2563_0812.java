package Bj2563_색종이;

import java.util.Scanner;

public class Bj2563_0812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		boolean[][] board = new boolean[101][101];

		for (int tc = 1; tc <= t; tc++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int i = x; i < x + 10; i++) {
				for (int j = y; j < y + 10; j++) {
					board[i][j] = true;
				}
			}
		}

		int result = 0;
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (board[i][j]) {
					result++;
				}
			}
		}
		
		System.out.println(result);
	}

}
