package Bj10870_피보나치수5;

import java.util.Scanner;

public class Bj10870_0904 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = solution(num);
		System.out.println(result);
		
	}
	static int solution(int a) {
		if(a == 0) {
			return 0;
		}
		if(a == 1) {
			return 1;
		}
		return solution(a-1) + solution(a-2);
	}
}
