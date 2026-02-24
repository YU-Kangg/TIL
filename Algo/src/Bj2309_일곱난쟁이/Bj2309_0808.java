package Bj2309_일곱난쟁이;

import java.util.Arrays;
import java.util.Scanner;

public class Bj2309_0808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		Arrays.sort(a);
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - a[i] - a[j] == 100) {
					for (int k = 0; k < 9; k++) {
						if (k == i || k == j)
							continue;
						System.out.println(a[k]);
					}
				}
			}
		}

	}
}
