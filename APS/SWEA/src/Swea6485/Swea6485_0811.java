package Swea6485;

import java.util.Scanner;

public class Swea6485_0811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int line = sc.nextInt();

			int[] start = new int[line];
			int[] end = new int[line];
			for (int i = 0; i < line; i++) {
				start[i] = sc.nextInt();
				end[i] = sc.nextInt();
			}

			int total = sc.nextInt();

			int[] result = new int[total];
			for (int i = 0; i < total; i++) {
				int busStop = sc.nextInt();
				for (int j = 0; j < line; j++) {
					if (busStop >= start[j] && busStop <= end[j]) {
						result[i]++;
					}
				}
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < total; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
		}
	}
}