package Bj20920_영단어암기는괴로워;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bj20920_0910 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int L = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < T; i++) {
			String s = sc.next();
			if (L <= s.length()) {
				if (map.containsKey(s)) {
					map.replace(s, map.get(s) + 1);
				} else {
					map.put(s, 1);
				}
			}
		}

		List<String> list = new ArrayList<>(map.keySet());
		list.sort((a, b) -> {
			int freqCompare = map.get(b).compareTo(map.get(a)); // 빈도 내림차순
			if (freqCompare != 0)
				return freqCompare;

			int lenCompare = Integer.compare(b.length(), a.length()); // 길이 내림차순
			if (lenCompare != 0)
				return lenCompare;

			return a.compareTo(b); // 사전순 오름차순
		});

		// 출력
		StringBuilder sb = new StringBuilder();
		for (String word : list) {
			sb.append(word).append("\n");
		}
		System.out.print(sb);
	}

}
