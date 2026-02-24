package Bj2156_포도주시식;

import java.util.Scanner;

public class Bj2156_1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] arr = new int[T + 1];
		int[] dp = new int[T + 1];
		for (int i = 1; i <= T; i++) {
			arr[i] = sc.nextInt();
		}

		dp[1] = arr[1];
		if (T > 1) {
			dp[2] = dp[1] + arr[2];
		}

		for (int i = 3; i <= T; i++) {
			int a = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
			int b = dp[i-1];
			dp[i] = Math.max(a, b);
		}
		
		System.out.println(dp[T]);

	}

}
