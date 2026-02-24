package Swea1954;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea1954_0805_2 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Swea/src/Swea1954/input (5).txt");

		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);

		// 가운데부터 시작
		
		int N = sc.nextInt();
		int[][] arr = new int[3][3];
		
		int K = N;
		int D = 1; //방향
		int r = 0; //행
		int c = 1; //열
		int num = 1;
		
		for(int i = 0; i<K; i++) {
			r += D;
			arr[r][c] = num;
		}
		
		
		
		
	}
}
