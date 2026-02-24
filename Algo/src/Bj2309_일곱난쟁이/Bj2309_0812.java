package Bj2309_일곱난쟁이;

import java.util.Arrays;
import java.util.Scanner;

public class Bj2309_0812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] person = new int[9];
		for (int i = 0; i < 9; i++) {
			person[i] = sc.nextInt();
		}

		int total = 0;
		for (int i = 0; i < 9; i++) {
			total += person[i];
		}

		Arrays.sort(person);
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (total - person[i] - person[j] == 100) {
					for (int k = 0; k < 9; k++) {
						if (k == i || k == j) {
							continue;
						}
						System.out.println(person[k]);
					}
					return;
				}
			}
		}

	}
}
