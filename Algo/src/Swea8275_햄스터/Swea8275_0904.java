package Swea8275_햄스터;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swea8275_0904 {
	static int N;
	static int X;
	static int M;
	static int[] start;
	static int[] end;
	static int[] count;
	static List<Integer[]> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			// 햄스터 우리수
			N = sc.nextInt();
			// 최소 햄스터수
			X = sc.nextInt();
			// 기록수
			M = sc.nextInt();

			for (int i = 0; i < M; i++) {
				start[i] = sc.nextInt();
				end[i] = sc.nextInt();
				count[i] = sc.nextInt();
			}
			int[] arr = new int[N];
			for (int TC = 0; TC < M; TC++) {
				for (int i = start[TC]; i < end[TC]; i++) {
					for (int j = start[TC]; j < end[TC]; j++) {

					}
				}
			}

		}
	}

	static void search(int[] start, int[] end, int count[], int N) {

		return;

	}

}
