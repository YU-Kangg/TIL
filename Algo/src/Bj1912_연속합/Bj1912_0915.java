package Bj1912_연속합;

import java.util.Scanner;

public class Bj1912_0915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dp[0] = arr[0];
        
        int max = dp[0];
        
        
        for (int i = 1; i < n; i++) {
        	// 연속된 수를 합치면서 이전합이 더 좋으면 이어붙이고
        	// 현재수가 더 크면 새로 시작
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            //최대값 갱신
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
