package Bj1992_쿼드트리;

import java.util.Scanner;

public class Bj1992_1022 {
	static int N;
	static char[][] board;
	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		board = new char[N][N];
		for (int i = 0; i < N; i++) {
			String st = sc.next();
			for (int j = 0; j < N; j++) {
				board[i][j] = st.charAt(j);
			}
		}

		sb = new StringBuilder();
		func(0, 0, N);
		System.out.println(sb.toString());
	}

	static StringBuilder func(int x, int y, int size) {
		if (check(x, y, size)) {
			if (board[x][y] == '1') {
				return sb.append(1);
			} else {
				return sb.append(0);
			}
		}
		sb.append('(');
		int newSize = size / 2;
		func(x, y, newSize);
		func(x, y + newSize, newSize);
		func(x + newSize, y, newSize);
		func(x + newSize, y + newSize, newSize);

		return sb.append(")");
	}

	static boolean check(int x, int y, int size) {
		char checkChar = board[x][y];
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (checkChar != board[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
