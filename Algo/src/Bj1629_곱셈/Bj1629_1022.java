package Bj1629_곱셈;

import java.util.Scanner;

public class Bj1629_1022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		long result = (long) (Math.pow(A, B) % C);
		
		System.out.println(result);
	}

}
