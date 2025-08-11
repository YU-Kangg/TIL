import java.util.Scanner;

public class Algo2_서울_13_강영욱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int N = sc.nextInt();
			int result = 0;
			
			// 상 하 좌 우 좌상 좌하 우상 우하
			int[] dr = { -1, 1, 0, 0, -1, 1, -1, 1 };
			int[] dc = { 0, 0, -1, 1, -1, -1, 1, 1 };

			int[][] num = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					num[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					boolean isOk = true;
					for (int k = 0; k < 8; k++) {
						int nr = i + dr[k];
						int nc = j + dc[k];

						if (nr >= 0 && nr < N && nc >= 0 && nc < N && num[i][j] >= num[nr][nc]) {
							isOk = false;
						}
					}
					if (isOk) {
						result++;
					}
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}
