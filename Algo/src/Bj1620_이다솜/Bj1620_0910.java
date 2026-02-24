package Bj1620_이다솜;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj1620_0910 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		Map<Integer, String> map1 = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		// 포켓몬 이름 입력
		for (int i = 1; i <= N; i++) {
			String name = br.readLine();
			map.put(name, i);
			map1.put(i, name);
		}

		StringBuilder sb = new StringBuilder();
		// 조회
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (map.containsKey(s)) {
				// 이름 → 번호
				sb.append(map.get(s)).append("\n");
			} else {
				// 번호 → 이름
				sb.append(map1.get(Integer.parseInt(s))).append("\n");
			}
		}
		System.out.print(sb);
	}
}
