package Bj17103_골드바흐파티션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj17103_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();
			
			// 소수 2 3 5 7 11 13
			boolean[] check = new boolean[N+1];
			int[] arr = new int[N+1];
			for(int i = 1; i<=N; i++) {
				arr[i] = i;
			}
			
			check[1] = true;
			
			for(int i = 2; i<=N; i++) {
				if(i == 2) {
					check[i] = true;
				}
				
				
			}
			
			
			
			
		}
		
		
	}

}
