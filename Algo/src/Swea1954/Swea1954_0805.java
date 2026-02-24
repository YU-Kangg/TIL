package Swea1954;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea1954_0805 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Swea/src/Swea1954/input (5).txt");

		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];

			int K = N; // 이동할 칸의 수
			int D = 1; // 증감 1-> -1 -> 1
			// 현재 좌표
			int r = 0;
			int c = -1;
			int num = 1;

			while (true) {
				for (int i = 0; i < K; i++) {
					c += D; // 때로는 1, 떄로는 -1
					arr[r][c] = num++;
				}
				K--;
				if (K == 0)
					break;

				for (int i = 0; i < K; i++) {
					r += D;
					arr[r][c] = num++;
				}
				D = -D;
			}
			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
