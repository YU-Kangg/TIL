package Bj13300_방배정;

import java.util.Scanner;

public class Bj13300_0807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int t = sc.nextInt();
		int p = sc.nextInt();
		
		int result = 0;
		int[][] arr = new int[2][6];
		
		for(int i = 0; i<t; i++) {
			int gender = sc.nextInt();
			int grade = sc.nextInt();
			arr[gender][grade-1]++;
		}
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<6; j++) {
				int count = arr[i][j];
				
				result += (count / p);
				
				if(count%p!=0) {
					result ++;
				}
			}
		}
		System.out.println(result);
	}
}
