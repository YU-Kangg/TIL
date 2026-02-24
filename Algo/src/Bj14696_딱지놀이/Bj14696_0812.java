package Bj14696_딱지놀이;

import java.util.Scanner;

public class Bj14696_0812 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int Acount = sc.nextInt();
			int[] Adraw = new int[Acount];
			int[][] result = new int[2][4];
			for (int i = 0; i < Acount; i++) {
				Adraw[i] = sc.nextInt();
				result[0][Adraw[i] - 1]++;
			}

			int Bcount = sc.nextInt();
			int[] Bdraw = new int[Bcount];
			for (int i = 0; i < Bcount; i++) {
				Bdraw[i] = sc.nextInt();
				result[1][Bdraw[i] - 1]++;
			}

			boolean isOk = false;
			int draw = 0;
			for (int i = 3; i >= 0; i--) {
				if (result[0][i] > result[1][i]) {
					isOk = true;
					break;
				}
				if (result[0][i] < result[1][i]) {
					break;
				}
				if (result[0][i] == result[1][i]) {
					draw++;
				}
			}
			if (draw == 4) {
				System.out.println("D");
			} else if (isOk) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}
	}
}
