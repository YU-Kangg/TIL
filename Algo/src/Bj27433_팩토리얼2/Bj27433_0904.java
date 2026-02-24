package Bj27433_팩토리얼2;

import java.util.Scanner;

public class Bj27433_0904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextInt();
		long result = factorial(num);
		System.out.println(result);
		
	}
	
	static long factorial(long num) {
		if(num == 0) {
			return 1;
		}else {
			return num * factorial(num -1);
		}
		
	}
}

