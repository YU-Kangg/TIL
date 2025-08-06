package Swea1208;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea1208_0805 {

	public static void main(String[] args) throws FileNotFoundException {
//		File file = new File("SWEA/src/Swea1208/input (2).txt");

//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[100];
		//입력 받기
		for (int k = 1; k <= 10; k++) {
			int tc = sc.nextInt();
			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}

			for (int i = 0; i < tc; i++) {
				//정렬
				int[] sorted = countingSort(arr, 1001);
				
				//가장 작은값은 올리고
				sorted[0]++;
				
				//가장 큰값은 내리고
				sorted[sorted.length - 1]--;
				
				//arr배열에 sorted 배열을 넣어줌
				arr = sorted;
			}
			//마지막으로 정렬 한번 해주고
			int[] sorted = countingSort(arr, 1001);
			
			//출력
			System.out.println("#" + k + " " + (sorted[sorted.length -1] - sorted[0]));
		}
	}

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
		for (int i = N - 1; i >= 0; i--) {
			sorted[--count[arr[i]]] = arr[i];
		}
		return sorted;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] countSort(int[] arr,int K) {
		//1 범위 확인해서 count 배열 만들어두기
		int[] count = new int[K];
		int N = arr.length;
		
		//2 카운트에 arr[i] 개수 넣기
		for(int i = 0; i<N; i++) {
			count[arr[i]]++;
		}
		
		//3 누적합
		for(int i = 1; i<K - 1; i++) {
			count[i] += count[i-1];
		}
		//4 뒤에서부터 정렬
		int[] sort = new int[N];
		for(int i = N-1; i>=0; i++) {
			sort[--count[arr[i]]] = arr[i];
		}
		
		return sort;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
