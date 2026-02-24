package Bj2839_설탕배달;

import java.util.Scanner;

public class Bj2839_0827 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num % 5 == 0) {
			System.out.println(num / 5);
			return;
		}

		int result = num/3;
		boolean isOk = false;
		for (int i = 0; i <= num / 3; i++) {
			for (int j = 0; j <= num / 5; j++) {
				if (3 * i + 5 * j == num) {
					result = Math.min(result, i+j);
					isOk = true;
				}
			}
		}
		
		if(isOk == false) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(result);

	}

}
