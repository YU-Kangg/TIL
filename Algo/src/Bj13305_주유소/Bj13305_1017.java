package Bj13305_주유소;

import java.util.Scanner;

public class Bj13305_1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] length = new long[N-1];
		for(int i = 0 ;i<N-1; i++) {
			length[i] = sc.nextLong();
		}
		
		long[] prices = new long[N];
		for(int i = 0; i<N; i++) {
			prices[i] = sc.nextLong();
		}

		long lowPrice = prices[0];
		
		long result = 0;
		
		for(int i = 0; i<N-1; i++) {
			if(lowPrice > prices[i]) {
				lowPrice = prices[i];
			}
			result += lowPrice * length[i];
		}
		
		System.out.println(result);
	}
}