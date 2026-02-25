package Swea1984;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea1984_0804 {

	public static void main(String[] args) throws FileNotFoundException {
//		File file = new File("./src/Swea1984/input.txt");

//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		for (int k = 1; k <= tc; k++) {
			int[] arr = new int[tc];

			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}

//			SelectionSort(arr);
//			bubbleSort(arr);
			arr = countingSort(arr, 10001);
			double result = 0;
			for (int i = 0; i < arr.length; i++) {
				result += arr[i];
			}
			result = (result - arr[0] - arr[arr.length - 1]) / (arr.length - 2);
			int result2 = (int) Math.round(result);
			System.out.println("#" + k + " " + result2);
		}
	}

	// 선택 정렬
	public static void SelectionSort(int[] arr) {
		int N = arr.length;
		for (int i = 0; i < N - 1; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
	}

	// 카운팅 정렬
	public static int[] countingSort(int[] arr, int K) {
		// 1.데이터 범위 확인해서 만들어두기
		int[] count = new int[K];
		int N = arr.length;
		// 2.데이터를 순회하면서 해당 인덱스 값을 증가
		for (int i = 0; i < N; i++) {
			count[arr[i]]++;
		}
		// 3.카운트 배열의 누적합을 구한다.
		for (int i = 1; i < K - 1; i++) {
			count[i] = count[i] + count[i - 1];
		}
		// 4.원본 배열의 뒤에서부터 순회하며 원소를 배치
		int[] sorted = new int[N];
		for (int i = N-1; i >= 0; i--) {
			sorted[--count[arr[i]]] = arr[i];
		}
		return sorted;
	}

	// 버블 정렬
	public static void bubbleSort(int[] arr) {
		int N = arr.length;
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < N - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

}
