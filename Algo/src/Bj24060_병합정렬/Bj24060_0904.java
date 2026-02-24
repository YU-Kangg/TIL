package Bj24060_병합정렬;

import java.util.Scanner;

public class Bj24060_0904 {
	static int K, N;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		
		arr = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		
		
	}
	
	static void merge_sort(int[] arr) {
		
	}
	
	static void merge(int[] arr, int p, int q, int r) {
		int i = p;
		int j = q+1;
		int t = 1;
		while(i<= q  && j<= r) {
			if(arr[i] <= arr[j]) {
				
			} else
		}
	}
}
