package Bj10844_쉬운계단수_미완;

import java.util.Scanner;

public class Bj10844_0916 {
    static final int MOD = 1_000_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[][] dp = new long[N + 1][10];
        // 초기값: 길이 1인 계단수
        for (int j = 1; j <= 9; j++) {
            dp[1][j] = 1;
        }
        dp[1][0] = 0;  // 0으로 시작 불가

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                long count = 0;
                if (j > 0) {
                    // 이전 마지막이 j‑1 가능
                    count += dp[i - 1][j - 1];
                }
                if (j < 9) {
                    // 이전 마지막이 j+1 가능
                    count += dp[i - 1][j + 1];
                }
                dp[i][j] = count % MOD;
            }
        }

        long answer = 0;
        for (int j = 0; j <= 9; j++) {
            answer = (answer + dp[N][j]) % MOD;
        }

        System.out.println(answer);
        sc.close();
    }
}
