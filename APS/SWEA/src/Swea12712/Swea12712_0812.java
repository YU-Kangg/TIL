package Swea12712;

import java.util.Scanner;

public class Swea12712_0812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int tc = 1; tc<=t; tc++) {
			int N = sc.nextInt();
			int spread = sc.nextInt();
			
			int[][] arr = new int[N][N];
			for(int i = 0; i<N; i++) {
				for(int j =0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int maxPlus = 0;
			int maxX = 0;
			int resultPlus = 0;
			int resultX = 0;
			
			for(int i =0 ; i<spread; i++) {
				int[] dr = {i, -i, 0, 0};
				int[] dc = {0, 0, -i, i};
				int[] dz = {i, i, -i, -i};
				int[] dy = {i, -i, i, -i};
				
				
			}
			
			
			
//			for(int i = 0; i<N; i++) {
//				for(int j =0; j<N; j++) {
//					resultPlus += arr[i][j];
//					resultX += arr[i][j];
//					for(int k =0; k<spread; k++) {
//						if(i+k>=0 && i+k<N&&i-k>=0&&i-k<N)
//						resultPlus += arr[i][j+k];
//						resultPlus += arr[i+k][j];
//						resultPlus += arr[i-k][j];
//						resultPlus += arr[i][j-k];
//					}
//					if(resultPlus>maxPlus) {
//						maxPlus = resultPlus;
//					}
//				}
//			}
			
			
			
		}
	}

}
