package Bj1764_듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj1764_0911 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Set<String> set = new HashSet<>();
		for(int i = 0; i<N; i++) {
			set.add(br.readLine());
		}
		
		List<String> result = new ArrayList<>();
		for(int i = 0; i<M; i++) {
			String tmp = br.readLine();
			if(set.contains(tmp)) {
				result.add(tmp);
			}
		}
			
		Collections.sort(result);
		
		StringBuilder sb = new StringBuilder();
		sb.append(result.size()).append("\n");
		for(String rs : result) {
			sb.append(rs).append("\n");
		}
		
		System.out.println(sb);
	}

}
