package Bj11478_서로다른부분문자열의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj11478_0911 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		int N = str.length();
		
		Set<String> set = new HashSet<>();
		
		for(int i = 0; i<N; i++) {
			for(int j = i+1; j<=N; j++) {
				set.add(str.substring(i, j));
			}
		}
		
		System.out.println(set.size());
	}

}
