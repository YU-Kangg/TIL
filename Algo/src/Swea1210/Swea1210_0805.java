package Swea1210;

import java.util.Scanner;

public class Swea1210_0805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dx = { -1, 1 }; // 왼쪽, 오른쪽

		for (int testCase = 1; testCase <= 10; testCase++) {
			int row = 99, col = 0;
			int[][] ladder = new int[100][100];
			int tcNum = sc.nextInt();
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++)
					ladder[i][j] = sc.nextInt();
			}

			for (int j = 0; j < 100; j++) {
				if (ladder[99][j] == 2)
					col = j;
			}

			while (row > 0) {
			    boolean moved = false;
			    for (int d = 0; d < 2; d++) {
			        int nextCol = col + dx[d];
			        while (nextCol >= 0 && nextCol < 100 && ladder[row][nextCol] == 1) {
			            col = nextCol;
			            nextCol += dx[d];
			            moved = true;
			        }
			        if (moved) break;
			    }
			    // 이동했든 안 했든 한 칸 위로
			    row--;
			}
			System.out.println("#" + " " + col);
		}
	}
}