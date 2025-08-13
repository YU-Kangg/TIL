package TEST2;

import java.util.Scanner;

public class Test2_0813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 개수 입력
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			//보드 크기 입력
			int N = sc.nextInt();
			//보드 생성
			int[][] board = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					board[i][j] = sc.nextInt();
				}
			}
			// 상 하 좌 우 좌상 우상 좌하 좌하
			int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
			int[] dc = { 0, 0, -1, 1, -1, 1, -1, 1 };
			
			//결과값 저장을 위한 result생성
			int result = 0;
			
			//보드 완전 탐색 for문
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					
					// 대상의 상태를 확인할 boolean
					boolean isOk = true;
					
					//델타 이동을 위한 for문
					for (int k = 0; k < 8; k++) {
						int nr = i + dr[k];
						int nc = j + dc[k];
						
						// nr과 nc의 범위 조절, 대상의 8방향 탐색 후 대상이 8방향보다 크다면 false
						if (nr >= 0 && nr < N && nc >= 0 && nc < N && board[i][j] > board[nr][nc]) {
							isOk = false;
						}
					}
					
					// 8방향 탐색 끝났는데도 isOk가 true라면 8방향중에 큰 값이 없었던거니까 result에 +1 
					if (isOk) {
						result++;
					}
				}
			}
			
			//출력
			System.out.println("#" + tc + " " + result);
		}
	}
}
