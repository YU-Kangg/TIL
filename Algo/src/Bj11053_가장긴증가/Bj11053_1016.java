package Bj11053_가장긴증가;

import java.util.Scanner;

public class Bj11053_1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[N + 1];

		dp[1] = 1;
		
		int min = arr[1];
		int max = arr[1];
		for (int i = 2; i <= N; i++) {
			dp[i] = if(arr[i]>min
		}
		System.out.println();
	}

}
