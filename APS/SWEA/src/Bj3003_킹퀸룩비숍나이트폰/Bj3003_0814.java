package Bj3003_킹퀸룩비숍나이트폰;

import java.util.Scanner;

public class Bj3003_0814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 6;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 2; i++) {
			arr[i] = 1 - arr[i];
		}
		
		for (int i = 2; i < 5; i++) {
			arr[i] = 2 - arr[i];
		}
		
		arr[5] = 8 - arr[5];

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
