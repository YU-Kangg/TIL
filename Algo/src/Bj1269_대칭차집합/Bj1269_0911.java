package Bj1269_대칭차집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj1269_0911 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int aC = Integer.parseInt(st.nextToken());
		int bC = Integer.parseInt(st.nextToken());
		
		Set<Integer> set = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<aC; i++) {
			int a = Integer.parseInt(st.nextToken());
			set.add(a);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<bC; i++) {
			int b = Integer.parseInt(st.nextToken());
			if(set.contains(b)) {
				set.remove(b);
			} else {
				set.add(b);
			}
		}
		
		System.out.println(set.size());
	}

}
