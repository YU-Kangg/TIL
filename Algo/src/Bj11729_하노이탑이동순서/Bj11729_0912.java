package Bj11729_하노이탑이동순서;

import java.util.Scanner;

public class Bj11729_0912 {
	static int start, mid, end;
	static int K;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt();
		int count = (int) Math.pow(2, K) - 1;
		sb.append(count).append("\n");
		hanoi(K, 1, 2, 3);
		System.out.println(sb.toString());
	}

	static void hanoi(int K, int start, int mid, int end) {
		if (K == 1) {
			sb.append(start + " " + end).append("\n");
			return;
		}

		hanoi(K - 1, start, end, mid);
		sb.append(start + " " + end).append("\n");
		hanoi(K - 1, mid, start, end);
	}
}
