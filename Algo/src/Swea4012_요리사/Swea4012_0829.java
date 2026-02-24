package Swea4012_요리사;

import java.util.Scanner;

public class Swea4012_0829 {
	static int N;
	static int[][] board;
	static boolean[] status;
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <=T; tc++) {
			N = sc.nextInt();
			board = new int[N][N];
			status = new boolean[N];
			result = Integer.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					board[i][j] = sc.nextInt();
				}
			}
			
			c(0,0);
			
			System.out.println("#" + tc + " " + result);
		}
	}

	public static void c(int idx, int sidx) {
		if (sidx == N / 2) {
			p();
			return;
		}
		if (idx >= N) {
			return;
		}

		// 재귀파트
		status[idx] = true;
		c(idx + 1, sidx + 1);
		status[idx] = false;
		c(idx + 1, sidx);
	}
	
	public static void p() {
		int a = 0;
		int b = 0;
		int tmp = 0;
		
		for(int i = 0; i<N-1; i++) {
			for(int j = i+1; j<N; j++) {
				if(status[i] == status[j]) {
					a += board[i][j] + board[j][i];
				}else if(!status[i] == !status[j]) {
					b += board[i][j] + board[j][i];
				}
				
				tmp = Math.abs(a-b);
				result = Math.min(tmp, result);
			}
		}
		
		
	}
}
