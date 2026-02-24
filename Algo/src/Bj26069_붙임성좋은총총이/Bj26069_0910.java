package Bj26069_붙임성좋은총총이;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bj26069_0910 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Boolean> map = new HashMap<>();
		
		
		int T = sc.nextInt();
		Set<String> set = new HashSet<>();
		
		set.add("ChongChong");
		
		for(int i = 0; i<T; i++) {
			String L = sc.next();
			String R = sc.next();
		if(set.contains(L) || set.contains(R)) {
			set.add(L);
			set.add(R);
		}
		}
		
		System.out.println(set.size());
		
		
	}

}
