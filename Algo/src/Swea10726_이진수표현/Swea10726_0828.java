package Swea10726_이진수표현;

import java.util.Scanner;

public class Swea10726_0828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {

			int N = sc.nextInt();
			int M = sc.nextInt();
			boolean isOk = true;

			StringBuilder sb = new StringBuilder();
			int tmp = M;
			if (tmp == 0) {
				sb.append(0);
			} else {
				while (true) {
					sb.append(tmp % 2);
					tmp = tmp / 2;
					if (tmp == 1 || tmp == 0) {
						sb.append(tmp);
						break;
					}
				}
			}
			String a = sb.reverse().toString();
			
			while (a.length() < N) {
				a += "0";
			}
			
			for (int j = 0; j < N; j++) {
				if (a.charAt(a.length() - N + j) != '1') {
					isOk = false;
					break;
				}
			}

			System.out.println("#" + tc + " " + (isOk ? "ON" : "OFF"));

		}

	}

}
