package Swea4012_요리사;

import java.util.Scanner;

public class 풀이_조합백트래킹 {
	static int N;
	static int[][] S; // 시너지 배열
	static boolean[] select; // 선택된 재료 표시
	static int answer;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			S = new int[N][N];
			select = new boolean[N];
			answer = Integer.MAX_VALUE;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					S[i][j] = sc.nextInt();
				}
			}

			// 조합으로 N/2개 선택
			combination(0, 0);

			System.out.println("#" + tc + " " + answer);
		}
		sc.close();
	}

	// 조합으로 N/2개 선택
	static void combination(int idx, int cnt) {
		if (cnt == N / 2) {
			calcDiff();
			return;
		}
		if (idx >= N)
			return;

		// 현재 재료 선택
		select[idx] = true;
		combination(idx + 1, cnt + 1);

		// 현재 재료 선택 X
		select[idx] = false;
		combination(idx + 1, cnt);
	}

	// 두 요리 시너지 계산
	static void calcDiff() {
		int sumA = 0, sumB = 0;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (select[i] && select[j]) {
					sumA += S[i][j] + S[j][i];
				} else if (!select[i] && !select[j]) {
					sumB += S[i][j] + S[j][i];
				}
			}
		}

		int diff = Math.abs(sumA - sumB);
		answer = Math.min(answer, diff);
	}
}
