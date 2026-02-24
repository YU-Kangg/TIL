package Bj2491_수열;

import java.util.Scanner;

public class Bj2491_0813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[T];
		for(int i = 0; i<T; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<T-1; i++) {
			int incr = 0;
			int decr = 0;
			for(int j =i+1; j<T; j++) {
				while(true) {
					if(arr[i]<arr[j]) {
						incr++;
					} else {
						break;
					}
				}
				if(arr[i]<=arr[j]) {
					
				}
			}
		}
		
		
	}
}
