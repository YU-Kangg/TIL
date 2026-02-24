package Bj2798_블랙잭;

import java.util.Scanner;

public class Bj2798_0814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int search = sc.nextInt();

		int[] arr = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}

		int result = 0;

		for (int i = 0; i < T - 2; i++) {
			for (int j = i + 1; j < T - 1; j++) {
				for (int k = j + 1; k < T; k++) {
					if (arr[i] + arr[j] + arr[k] > result && arr[i] + arr[j] + arr[k] <= search) {
						result = arr[i] + arr[j] + arr[k];
					}
				}
			}
		}
		System.out.println(result);
	}
}
