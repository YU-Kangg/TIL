package Bj1149_RGB거리;

import java.util.Scanner;

public class Bj1149_0915 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 양옆의 집의 색깔과 같으면 안됨.

		int N = sc.nextInt();
		int[][] cost = new int[N][3];
		int[][] dp = new int[N][3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				cost[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			dp[0][i] = cost[0][i];
		}

		for (int i = 1; i < N; i++) {
			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0]; // R
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1]; // G
			dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2]; // B
		}
		
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			result = Math.min(result, dp[N - 1][i]);
		}
		
		System.out.println(result);
	}

}
