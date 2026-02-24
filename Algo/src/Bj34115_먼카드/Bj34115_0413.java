package Bj34115_먼카드;

import java.util.Scanner;

public class Bj34115_0413 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int P = 2 * N;
		int[] num = new int[P];
		for (int i = 0; i < P; i++) {
			num[i] = sc.nextInt();
		}

		int result = 0;
		for (int i = 0; i < P - 1; i++) {
			int count = 0;
			for (int j = i + 1; j < P; j++) {
				if (num[i] == num[j]) {
					count += j - i - 1;
				}
			}
			if (count > result) {
				result = count;
			}
		}
		System.out.println(result);
	}

}