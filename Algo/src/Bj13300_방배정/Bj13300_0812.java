package Bj13300_방배정;

import java.util.Scanner;

public class Bj13300_0812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int room = sc.nextInt();

		int[][] student = new int[2][6];
		for (int i = 0; i < total; i++) {
			int gender = sc.nextInt();
			int grade = sc.nextInt();
			student[gender][grade - 1]++;
		}

		int result = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				result += student[i][j] / room;
				if (student[i][j] % room != 0) {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
