package Swea1210;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea1210_0805 {
	static int[] dr = { -1, 1, 0, 0 }; // 행의 변화량 dy | dx | di
	static int[] dc = { 0, 0, -1, 1 }; // 열의 변화량 dx | dy | dj

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Swea/src/Swea1210/input (4).txt");

		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		// 입력 받기
		int startIdx = 0;
		int count = 0;
		int[] otherLine = new int[count];

		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			int[][] arr = new int[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < 100; i++) {
				if (arr[99][i] == 1) {
					count++;
					otherLine[i] = arr[99][i];
				} else if (arr[99][i] == 2) {
					startIdx = i;
				}
			}
		}
	}
}