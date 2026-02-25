package Bj17406_배열돌리기;

import java.util.Scanner;

public class Bj17406 {
	static int N, M, K;
	static int[][] originalMap;
	static Operation[] ops;
	static boolean[] visited;
	static int[] resultOrder;
	static int minVal = Integer.MAX_VALUE;

	// 회전 연산 정보를 담을 클래스
	static class Operation {
		int r, c, s;

		public Operation(int r, int c, int s) {
			this.r = r;
			this.c = c;
			this.s = s;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();

		originalMap = new int[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				originalMap[i][j] = sc.nextInt();
			}
		}

		ops = new Operation[K];
		for (int i = 0; i < K; i++) {
			ops[i] = new Operation(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}

		visited = new boolean[K];
		resultOrder = new int[K];

		// 1. 순열 생성 시작
		solve(0);

		System.out.println(minVal);
	}

	// 순열을 통해 회전 순서를 정하는 함수
	static void solve(int depth) {
		if (depth == K) {
			// 순서가 정해지면 배열 복사 후 회전 수행
			doRotation();
			return;
		}

		for (int i = 0; i < K; i++) {
			if (!visited[i]) {
				visited[i] = true;
				resultOrder[depth] = i;
				solve(depth + 1);
				visited[i] = false;
			}
		}
	}

	static void doRotation() {
		// 원본 보존을 위해 복사본 생성
		int[][] tempMap = new int[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			tempMap[i] = originalMap[i].clone();
		}

		// 정해진 순서대로 회전 연산 적용
		for (int idx : resultOrder) {
			Operation op = ops[idx];
			rotate(tempMap, op.r, op.c, op.s);
		}

		// 배열의 값 계산 (각 행의 합 중 최솟값)
		getArrayValue(tempMap);
	}

	static void rotate(int[][] map, int r, int c, int s) {
		// s개의 겹쳐진 사각형을 각각 회전
		for (int layer = 1; layer <= s; layer++) {
			int top = r - layer;
			int left = c - layer;
			int bottom = r + layer;
			int right = c + layer;

			// 가장 왼쪽 위 값을 따로 보관 (덮어씌워지기 때문)
			int temp = map[top][left];

			// 1. 왼쪽 변 (아래에서 위로)
			for (int i = top; i < bottom; i++) {
				map[i][left] = map[i + 1][left];
			}
			// 2. 아래쪽 변 (오른쪽에서 왼쪽으로)
			for (int i = left; i < right; i++) {
				map[bottom][i] = map[bottom][i + 1];
			}
			// 3. 오른쪽 변 (위에서 아래로)
			for (int i = bottom; i > top; i--) {
				map[i][right] = map[i - 1][right];
			}
			// 4. 위쪽 변 (왼쪽에서 오른쪽으로)
			for (int i = right; i > left + 1; i--) {
				map[top][i] = map[top][i - 1];
			}
			// 보관했던 값 넣기
			map[top][left + 1] = temp;
		}
	}

	static void getArrayValue(int[][] map) {
		for (int i = 1; i <= N; i++) {
			int sum = 0;
			for (int j = 1; j <= M; j++) {
				sum += map[i][j];
			}
			minVal = Math.min(minVal, sum);
		}
	}
}