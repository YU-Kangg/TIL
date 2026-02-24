package Bj11066_파일합치기_미완;

import java.util.Arrays;
import java.util.Scanner;

public class Bj11066_10120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				arr[i] = sc.nextInt();
			}
			boolean[] visited = new boolean[N+1];

			int[] dp = new int[N + 1];
			Arrays.sort(arr);

			dp[1] = 0;
			dp[2] = arr[1] + arr[2];
			int result = dp[2];
			int min = Integer.MAX_VALUE;
			for (int i = 3; i < N; i++) {
				if(visited[i]) {
					continue;
				}
				
				if(dp[i-1] + arr[i] < arr[i] + arr[i] + 1) {
					dp[i] = arr[i] + arr[i+1];
					visited[i+1] = true;
				} else {
					dp[i] = dp[i-1] + arr[i];
				}
				
				result += dp[i];
			}
			System.out.println(tc + " " + result);
			// 1. 가장 작은 숫자 더하기
			// 2. math.min(arr[0] + arr[1] + arr[2], arr[2] + arr[3]) -> dp[i-1] + arr[i] or
			// dp[i-2] + arr[i-1] + arr[i];
		}
	}

}
