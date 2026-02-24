package Bj11444_피보나치수6_미완;

import java.util.Scanner;

public class Bj11444_1022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final long MOD = 1_000_000_007;
		long N = sc.nextInt() % MOD;
		int[] dp = new int[(int) N+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i<=N; i++) {
			dp[i] = dp[i-2] + dp[i-1];
		}
		
		System.out.println(dp[N]);
	}

}
