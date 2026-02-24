package Bj9461_파도반수열;

import java.util.Scanner;

public class Bj9461_0915 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			int num = sc.nextInt();
			
			long[] fib = new long[1000];
			fib[1] = 1;
			fib[2] = 1;
			fib[3] = 1;
			for(int j = 4; j<=num; j++) {
				fib[j] = fib[j-2] + fib[j-3];
			}
			
			System.out.println(fib[num]);
		}
	}

}
