package Bj1037_약수;

import java.util.Arrays;
import java.util.Scanner;

public class Bj1037_0910 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		long result = 0;
		if(arr.length != 1) {
			result = arr[0] * arr[N-1];
		} else {
			result = arr[0] * arr[0] ;
		}
				
		System.out.println(result);
		
	
	}

}

