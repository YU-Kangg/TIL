package Bj5597_과제안내신분;

import java.util.Scanner;

public class Bj5597_0813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 28;

		int[] student = new int[N];
		for (int i = 0; i < N; i++) {
			student[i] = sc.nextInt();
		}

		for (int i = 1; i <= 30; i++) {
			boolean isOk = true;
			for (int j = 0; j < N; j++) {
				if (student[j] == i) {
					isOk = false;
					break;
				}
			}
			if (isOk) {
				System.out.println(i);
			}
		}
	}

}
