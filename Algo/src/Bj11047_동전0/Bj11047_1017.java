package Bj11047_동전0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bj11047_1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 동전 개수
		int K = sc.nextInt(); // 목표 금액

		List<Integer> list = new ArrayList<>(); // 동전의 가치
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (a <= K) {
				list.add(a);
			} else {
				continue;
			}
		}

		Collections.sort(list, (a, b) -> {
			return b - a;
		});

		int recentPrice = 0;
		int start = 0;
		int count = 0;
		while (true) {
			if (recentPrice < K && recentPrice + list.get(start) <= K) {
				recentPrice += list.get(start);
				count++;
			} else if (recentPrice < K && recentPrice + list.get(start) > K)
				start++;
			else
				break;
		}

		System.out.println(count);
	}

}
