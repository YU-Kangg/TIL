package Swea5215_햄버거다이어트;

import java.util.Scanner;

public class Swea5215_0828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			int N = sc.nextInt();
			int L = sc.nextInt();

			int[] score = new int[N];
			int[] cal = new int[N];
			for (int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
				cal[i] = sc.nextInt();
			}
			
			int result = 0;
			
			for (int i = 0; i < (1 << N); i++) {
				int totalCal = 0;
				int totalScore = 0;
				for (int j = 0; j < N; j++) {
					if ((i & (1 << j)) != 0) {
						totalCal += cal[j];
						totalScore += score[j];
					}
				}
				if(totalCal<=L) {
					result = Math.max(result, totalScore);
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}

	}

}
