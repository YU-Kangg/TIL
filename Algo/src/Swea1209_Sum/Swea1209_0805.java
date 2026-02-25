package Swea1209;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea1209_0805 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Swea/src/Swea1209/input (3).txt");

		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		//입력
		for (int k = 1; k <= 10; k++) {
			int tc = sc.nextInt();
			int[][] arr = new int[100][100];
			int result = 0;
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			//행 최대값 찾기
			for(int i = 0; i<100; i++) {
				int tmp = 0;
				for(int j = 0; j<100; j++) {
					tmp = tmp + arr[i][j];
					if(tmp>result) {
						result = tmp;
					}
				}
			}
			//열 최대값 찾기
			for(int i = 0; i<100; i++) {
				int tmp = 0;
				for(int j = 0; j<100; j++) {
					tmp = tmp + arr[j][i];
					if(tmp>result) {
						result = tmp;
					}
				}
			}
			//대각선 최대값 찾기
			for(int i = 0; i<100; i++) {
				int tmp = 0;
				for(int j=0; j<100; j++) {
					if(i==j) {
						tmp = arr[i][j];
					}
					if(tmp>result) {
						result = tmp;
					}
				}
			}
			
			System.out.println("#" + k + " " + result);
		}
	}
}
