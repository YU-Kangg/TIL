package Bj10816_숫자카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj10816_0911 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int M = Integer.parseInt(br.readLine());
		int[] search = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<M; i++) {
			search[i] = Integer.parseInt(st.nextToken());
			map.put(search[i], 0);
		}

		for (int i = 0; i < N; i++) {
			if (map.containsKey(arr[i])) {
				map.replace(arr[i], map.get(arr[i])+1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			sb.append(map.get(search[i]) + " ");
		}
		System.out.println(sb.toString());
	}

}
