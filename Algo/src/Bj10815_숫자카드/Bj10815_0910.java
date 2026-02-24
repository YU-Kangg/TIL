package Bj10815_숫자카드;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bj10815_0910 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<>();
		int N = sc.nextInt();
		int[] sArr = new int[N];
		for (int i = 0; i < N; i++) {
			sArr[i] = sc.nextInt();
		}
	
		int M = sc.nextInt();
		int[] checkCard = new int[M];
		for(int i = 0; i<M; i++) {
			checkCard[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			map.put(checkCard[i], 0);
		}
		
		for(int i = 0; i<N; i++) {
			if(map.containsKey(sArr[i])) {
				map.replace(sArr[i], 1);
			}
		}
		
		for(int i = 0; i<M; i++) {
			System.out.print(map.get(checkCard[i]) + " ");
		}
		
	}

}
