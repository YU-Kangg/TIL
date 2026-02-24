package Bj1012_유기농배추;

import java.util.Scanner;

public class Bj1012_0925 {
	static int N, M, C, X, Y;
	static int[][] board;
	static int result;
	static boolean[][] visited;
	static int[] dc = {};
	static int[] dr = {};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			M = sc.nextInt();
			N = sc.nextInt();
			C = sc.nextInt();

			board = new int[N][M];
			for (int i = 0; i < C; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				board[b][a]++;
			}
			
			result = 0;
			
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<M; j++) {
					if(board[N][M] == 1 && !visited[N][M]) {
						result++;
						dfs(i, j);
					}
				}
			}
			System.out.println(result);
		}
	}

	static void dfs(int idx, int sidx) {
		visited[idx][sidx] = true;
		
		for(int i = 0; i<4; i++) {
			int nc = idx + dc[i];
			int nr = sidx + dr[i];
			
			if(isVaild(nc, nr) && visited[nc][nr]) {
				dfs(nc, nr);
			}
			
		}
	}
	
	static boolean isVaild(int nc, int nr) {
		return nc>=0 && nc<N && nr>=0 && nr<M;
	}
}
