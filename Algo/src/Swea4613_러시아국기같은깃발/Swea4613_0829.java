package Swea4613_러시아국기같은깃발;

import java.util.Scanner;

public class Swea4613_0829 {

	static int N, M;
	static char[][] board;
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			board = new char[N][M];

			for (int i = 0; i < N; i++) {
				board[i] = sc.next().toCharArray();
			}

			result = Integer.MAX_VALUE;

			for (int wEnd = 0; wEnd < N - 2; wEnd++) {
				for (int bEnd = wEnd + 1; bEnd < N - 1; bEnd++) {
					int repaint = 0;
					
					for(int  i =0; i<=wEnd; i++) {
						for(int j = 0; j<M; j++) {
							if(board[i][j] != 'W') {
								repaint ++;
							}
						}
					}
					
					for(int i = wEnd+1; i<=bEnd; i++) {
						for(int j = 0; j<M; j++) {
							if(board[i][j] != 'B') {
								repaint++;
							}
						}
					}
					
					for(int i = bEnd+1; i<N; i++) {
						for(int j = 0; j<M; j++) {
							if(board[i][j]!='R') {
								repaint++;
							}
						}
					}
					result = Math.min(repaint, result);
				}
			}
			System.out.println(result);
		}

	}

}
