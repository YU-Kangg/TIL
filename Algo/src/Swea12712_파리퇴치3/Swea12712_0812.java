package Swea12712;

import java.util.Scanner;

public class Swea12712_0812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력
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
			
			//+방향 결과와 X방향 결과를 담을 변수 생성
			int maxPlus = 0;
			int maxX = 0;
			
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					//델타이동하면서 값을 넣을 변수 만들고 델타 이동 전 값 넣어두기
					int resultPlus = arr[j][k];
					int resultX = arr[j][k];
					
					//spread-1만큼 4방향으로 더해줘야하니까 for문 돌리기   
					for (int i = 1; i < spread; i++) {
						int[] dr = { i, -i, 0, 0 };
						int[] dc = { 0, 0, -i, i };
						int[] dz = { i, i, -i, -i };
						int[] dy = { i, -i, i, -i };
						
						//델타이동
						for (int l = 0; l < 4; l++) {
							int nr = j + dr[l];
							int nc = k + dc[l];
							
							//+방향으로 범위 안벗어나는 범위안에서 resultPlus에 더해주기
							if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
								resultPlus += arr[nr][nc];
							}
							
							int nz = j + dz[l];
							int ny = k + dy[l];
							
							//X방향으로 범위 안벗어나는 범위 안에서 resultX에 더해주기
							if (nz >= 0 && nz < N && ny >= 0 && ny < N) {
								resultX += arr[nz][ny];
							}
						}
					}
					
					//큰값 찾아서 max에 대입
					if (resultPlus > maxPlus) {
						maxPlus = resultPlus;
					}
					if (resultX > maxX) {
						maxX = resultX;
					}
				}
			}
			//+와 x중에 큰거 출력
			System.out.println("#" + tc + " " + Math.max(maxPlus, maxX));
		}
	}
}