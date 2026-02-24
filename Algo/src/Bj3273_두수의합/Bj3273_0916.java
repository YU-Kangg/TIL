package Bj3273_두수의합;

import java.util.Arrays;
import java.util.Scanner;

public class Bj3273_0916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int F = sc.nextInt();

		Arrays.sort(arr);
		
		int start = 0;
		int end = N - 1;
		int result = 0;
		
		while (start != end) {
			int tmp = arr[start] + arr[end];
			if (tmp > F) {
				end--;
			}
			if (tmp < F) {
				start++;
			}
			if (tmp == F) {
				result++;
				start++;
			}
		}
		System.out.println(result);
	}
}