package Bj2559_수열;

import java.util.Scanner;

public class Bj2559_0813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int length = sc.nextInt();
		
		int[] arr = new int[total];
		for(int i = 0; i<total; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = 0;
		for(int i =0; i<length; i++) {
			result += arr[i];
		}
		
		for(int i = 1; i<=total-length; i++) {
			int count = 0;
			for(int j = 0; j<length; j++) {
				count += arr[i+j];
			}
			if(count>result) {
				result = count;
			}
		}
		
		System.out.println(result);
	}

}
