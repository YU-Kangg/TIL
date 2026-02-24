package Bj17136_색종이붙이기;

import java.util.Scanner;

public class Bj171316_1029 {
	static int[][] board;
	static int[] count;
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = 10;
		board = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		result = Integer.MAX_VALUE;
		count = new int[6];
		dfs(0, 0, 0);
		System.out.println((result == Integer.MAX_VALUE) ? "-1" : result);
	}

	static void dfs(int r, int c, int recentCount) {
		// 1. 종료 조건 (모든 칸을 다 확인했거나, 유효한 종료 조건 충족 시)
		if (r >= 10) { // r이 10이 되었다는 것은 0~9 행을 모두 탐색했다는 의미
			result = Math.min(result, recentCount);
			return;
		}

		// 2. 다음 칸 위치 업데이트 (10번째 열에 도달 시 행 넘김)
		if (c >= 10) {
			dfs(r + 1, 0, recentCount);
			return;
		}

		// 3. 현재 칸 처리
		if (board[r][c] == 1) {
			// 4. 색종이 붙이기 (k=5부터 k=1까지 역순으로 시도: 큰 것부터 시도해야 최소 개수 찾기 유리)
			for (int k = 5; k >= 1; k--) {
				if (count[k] < 5 && canAttach(r, c, k)) {

					// 5. 전진 (색종이 붙이기)
					attach(r, c, k, 0); // board 값을 0으로 변경
					count[k]++;

					// 6. 다음 DFS 호출
					dfs(r, c + 1, recentCount + 1);

					// 7. 후진 (백트래킹)
					count[k]--;
					attach(r, c, k, 1); // board 값을 1로 복구
				}
			}
			return;
		} else { // board[r][c] == 0 이면 다음 칸으로 이동
			dfs(r, c + 1, recentCount);
		}
	}

	static boolean canAttach(int r, int c, int k) {
		if (r + k > 10 || c + k > 10) {
			return false;
		}
		boolean check = true;
		for (int i = r; i < r + k; i++) {
			for (int j = c; j < c + k; j++) {
				if (board[i][j] == 0) {
					check = false;
				}
			}
		}
		return check;
	}

	static void attach(int r, int c, int k, int modify) {
		for (int i = r; i < r + k; i++) {
			for (int j = c; j < c + k; j++) {
				board[i][j] = modify;
			}
		}
	}
}
