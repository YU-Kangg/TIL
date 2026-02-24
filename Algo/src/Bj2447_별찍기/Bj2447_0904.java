package Bj2447_별찍기;

import java.util.Scanner;

public class Bj2447_0904 {
	public static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		arr = new char[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = ' ';
			}
		}

		star(0, 0, n);

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void star(int x, int y, int n) {
		if (n == 1) {
			arr[x][y] = '*';
			return;
		}

		int size = n / 3;
		int count = 0;

		for (int i = x; i < x + n; i += size) {
			for (int j = y; j < y + n; j += size) {
				count++;
				if (count == 5) {
					continue;
				} else {
					star(i, j, size);
				}
			}
		}
	}
}
