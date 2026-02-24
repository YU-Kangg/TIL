package Bj1932_정수삼각형;

import java.util.Scanner;

public class Bj1932_0915 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] tri = new int[n][n];
		int[][] dp = new int[n][n + 2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				tri[i][j] = sc.nextInt();
			}
		}

		dp[0][1] = tri[0][0];

		// dp[1][1] => dp[0][0] + tri[1][0] or dp[0][1] + tri[1][0];
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i + 1; j++) {
				dp[i][j] = Math.max(dp[i - 1][j - 1] + tri[i][j - 1], dp[i-1][j] + tri[i][j-1]);
			}
		}
		int result = 0;
		for (int i = 0; i <= n; i++) {
			result = Math.max(result, dp[n - 1][i]);
		}
		System.out.println(result);

	}

}
