package Bj2579_계단오르기;

import java.util.Scanner;

public class Bj2579_0916 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] stair = new int[N+1];
		int[] dp = new int[N+1];
		for (int i = 1; i <= N; i++) {
			stair[i] = sc.nextInt();
		}
		//dp[5] = st[1] [2] [4] [5] // st[2] [3] [5] // st[2] [4] [5] // st[1] [3] [5] -> dp[3] + st[5] // dp[5-2] + st [5-1] [5] 
		//dp[4] = st[1] [2] [4] // st[1] [3] [4] // st[2] [4] -> dp[4-2] + st[4] // dp[4-3] + st[4-1] [4]
		//dp[3] = st[2] [3] // st[1] [3] -> dp[3-2] + stair[3] // dp[3-3] + st[3-1] [3]
		dp[0] = 0;
		dp[1] = stair[1];
		
		for(int i = 2; i<=N; i++) {
			if(i == 2) {
				dp[2] = stair[1] + stair[2];
				continue;
			}
			dp[i] = Math.max(dp[i-2] + stair[i], dp[i-3] + stair[i-1] + stair[i]);
		}
		
		System.out.println(dp[N]);
		
	}

}
