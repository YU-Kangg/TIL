package Bj1463_1로만들기;

import java.util.Scanner;

public class Bj1463_917 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// 우선순위 1. N이 3의 배수거나 3의 배수 +1 이면 -1하고 3으로 나누는게 제일 효율 좋을꺼같은데?
		// 우선순위 2. N이 3의 배수가 아니면서 2의 배수이면 2를 나누자
		// 우선순위 3. 3의 배수와 2의 배수가 아니면 1을 빼야함

		int count = 0;
		while (N != 1) {
			if (N % 3 == 1) {
				count += 2;
				N--;
				N /= 3;
			} else if (N % 3 == 0) {
				count++;
				N /= 3;
			} else if (N % 2 == 0) {
				count ++;
				N /= 2;
			} else {
				count ++;
				N--;
			}
			
		}
		System.out.println(count);
	}
}
