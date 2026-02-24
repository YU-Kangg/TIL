package Bj3052_나머지;

import java.util.Scanner;

public class Bj3052_0813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] status = new boolean[42];
		int N = 10;
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			status[num[i] % 42] = true;
		}

		int result = 0;
		for (int i = 0; i < 42; i++) {
			if (status[i]) {
				result++;
			}
		}

		System.out.println(result);

	}

}
