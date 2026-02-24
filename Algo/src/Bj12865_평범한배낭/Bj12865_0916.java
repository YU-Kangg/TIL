package Bj12865_평범한배낭;

import java.util.Scanner;

public class Bj12865_0916 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = Integer.MIN_VALUE;

		// 물건의 수
		int N = sc.nextInt();
		// 버틸수 있는 무게
		int K = sc.nextInt();
		
		//무게
		int[] w = new int[N];
		//가치
		int[] v = new int[N];
		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

		int[] dp = new int[K + 1];

		for (int i = 0; i < N; i++) {
            for (int j = K; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
            }
        }
		System.out.println(dp[K]);
	}

}
