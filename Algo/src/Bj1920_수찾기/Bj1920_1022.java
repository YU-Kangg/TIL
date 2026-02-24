package Bj1920_수찾기;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bj1920_1022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> set = new HashSet<>();

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			set.add(sc.nextInt());
		}

		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int find = sc.nextInt();
			if (set.contains(find)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

	}

}
