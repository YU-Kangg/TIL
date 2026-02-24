package Bj1018_체스판다시칠하기;

import java.util.Scanner;

public class Bj1018_0827 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();
		int R = sc.nextInt();

		char[][] board = new char[C][R];
		for (int i = 0; i < C; i++) {
			String st = sc.next();
			for (int j = 0; j < R; j++) {
				board[i][j] = st.charAt(j);
			}
		}

		// 시작을 'W' 로 놨을때
		int count1 = Integer.MAX_VALUE;
		for (int k = 0; k <= C - 8; k++) {
			for (int l = 0; l <= R - 8; l++) {
				int tmp = 0;
				for (int i = k; i < 8 + k; i++) {
					for (int j = l; j < 8 + l; j++) {
						if ((i % 2 + j % 2) % 2 == 0 && board[i][j] == 'B') {
							tmp++;
						} else if ((i % 2 + j % 2) % 2 == 1 && board[i][j] == 'W') {
							tmp++;
						}
					}
				}
				count1 = Math.min(count1, tmp);
			}
		}

		int count2 = Integer.MAX_VALUE;
		for (int k = 0; k <= C - 8; k++) {
			for (int l = 0; l <= R - 8; l++) {
				int tmp = 0;
				for (int i = k; i < 8 + k; i++) {
					for (int j = l; j < 8 + l; j++) {
						if ((i % 2 + j % 2) % 2 == 0 && board[i][j] == 'W') {
							tmp++;
						} else if ((i % 2 + j % 2) % 2 == 1 && board[i][j] == 'B') {
							tmp++;
						}
					}
				}
				count2 = Math.min(count2, tmp);
			}
		}
		int result = Math.min(count1, count2);
		System.out.println(result);
	}

}
