package Bj10157_자리배정;

import java.util.Scanner;

public class Bj10157_0813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int search = sc.nextInt();
		int[][] board = new int[y][x];

		if (search > x * y) {
			System.out.println(0);
			return;
		}

		int D = 1;
		int startX = 0;
		int startY = y - 1;
		int num = 1;

		int X = x;
		int Y = y;

		while (true) {
			for (int i = 0; i < Y; i++) {
				board[startY][startX] = num++;
				if (i != Y - 1) {
					startY -= D;
				}
			}
			X--;
			
			for (int i = 0; i < X; i++) {
				startX += D;
				board[startY][startX] = num++;
			}
			Y--;
			D = -D;
			
			if (X<=0 || Y <= 0) {
				break;
			}
		}
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (board[i][j] == search) {
					System.out.println((j + 1) + " " + (y - i));
				}
			}
		}
	}
}
