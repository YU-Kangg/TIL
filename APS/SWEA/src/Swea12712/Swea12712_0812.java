package Swea12712;

import java.util.Scanner;

public class Swea12712_0812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			int N = sc.nextInt();
			int spread = sc.nextInt();

			int[][] arr = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int maxPlus = 0;
			int maxX = 0;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					int resultPlus = arr[j][k];
					int resultX = arr[j][k];

					for (int i = 1; i < spread; i++) {
						int[] dr = { i, -i, 0, 0 };
						int[] dc = { 0, 0, -i, i };
						int[] dz = { i, i, -i, -i };
						int[] dy = { i, -i, i, -i };
						
						for (int l = 0; l < 4; l++) {
							int nr = j + dr[l];
							int nc = k + dc[l];
							if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
								resultPlus += arr[nr][nc];
							}
							int nz = j + dz[l];
							int ny = k + dy[l];
							if (nz >= 0 && nz < N && ny >= 0 && ny < N) {
								resultX += arr[nz][ny];
							}
						}
					}
					if (resultPlus > maxPlus) {
						maxPlus = resultPlus;
					}
					if (resultX > maxX) {
						maxX = resultX;
					}
				}
			}
			System.out.println("#" + tc + " " + Math.max(maxPlus, maxX));
		}
	}
}