package Bj10163_색종이;

import java.util.Scanner;

public class Bj10163_0812 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int num = 1;
		int[][] board = new int[1002][1002];
		for (int tc = 1; tc <= t; tc++) {
			int leftX = sc.nextInt();
			int leftY = sc.nextInt();
			int r = sc.nextInt();
			int c = sc.nextInt();

			for (int i = leftX; i < leftX + r; i++) {
				for (int j = leftY; j < leftY + c; j++) {
					board[i][j] = num;
				}
			}
			num++;
		}

		for (int k = 1; k <= t; k++) {
			int count = 0;
			for (int i = 0; i < 1002; i++) {
				for (int j = 0; j < 1002; j++) {
					if (board[i][j] == k) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
