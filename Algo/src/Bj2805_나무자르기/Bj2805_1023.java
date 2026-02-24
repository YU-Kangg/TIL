package Bj2805_나무자르기;

import java.util.Scanner;

public class Bj2805_1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int maxHeight = Integer.MIN_VALUE;
		int minHeight = 0;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > maxHeight) {
				maxHeight = arr[i];
			}
		}
		int result = 0;
		while (minHeight <= maxHeight) {
			long count = 0;
			int mid = (maxHeight + minHeight) / 2;
			for (int i = 0; i < N; i++) {
				if (arr[i] - mid > 0) {
					count += arr[i] - mid;
				}
			}

			if (count >= M) {
				result = mid;
				minHeight = mid + 1;
			} else {
				maxHeight = mid - 1;
			}
		}

		System.out.println(result);
	}

}
