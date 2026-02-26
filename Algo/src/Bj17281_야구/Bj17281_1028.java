import java.util.Scanner;

public class Bj17281_1028 {
	static int N;
	static int[][] arr;
	static int[] order = new int[10];
	static boolean[] selected = new boolean[10];
	static int maxScore = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N + 1][10];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		order[4] = 1;
		selected[1] = true;
		solve(1);

		System.out.println(maxScore);
		sc.close();
	}

	// 타순을 정하는 순열 함수 (DFS)
	static void solve(int idx) {
		if (idx == 10) {
			playBall(); // 타순이 다 정해지면 경기 시작
			return;
		}

		// 4번 타석은 이미 고정되어 있으므로 건너뜀
		if (idx == 4) {
			solve(idx + 1);
			return;
		}

		for (int i = 2; i <= 9; i++) {
			if (!selected[i]) {
				selected[i] = true;
				order[idx] = i;
				solve(idx + 1);
				selected[i] = false;
			}
		}
	}

	// 정해진 타순으로 N이닝 동안 경기 시뮬레이션
	static void playBall() {
		int score = 0;
		int currentBatter = 1; // 1번 타석부터 시작

		for (int inning = 1; inning <= N; inning++) {
			int outCount = 0;
			boolean[] base = new boolean[4]; // 매 이닝 베이스 초기화 (1, 2, 3루)

			while (outCount < 3) {
				int result = arr[inning][order[currentBatter]];

				if (result == 0) {
					outCount++;
				} else if (result == 4) { // 홈런
					int count = 0;
					for (int i = 1; i <= 3; i++) {
						if (base[i]) {
							count++;
							base[i] = false;
						}
					}
					score += (count + 1);
				} else { // 안타, 2루타, 3루타
					score += moveRunners(base, result);
				}

				// 다음 타자로 이동 (9번 다음은 1번)
				currentBatter = (currentBatter % 9) + 1;
			}
		}
		maxScore = Math.max(maxScore, score);
	}

	// 주자 이동 로직
	static int moveRunners(boolean[] base, int hit) {
		int score = 0;
		// 기존 주자 이동 (뒤에서부터 이동시켜야 겹치지 않음)
		for (int i = 3; i >= 1; i--) {
			if (base[i]) {
				if (i + hit >= 4) {
					score++;
				} else {
					base[i + hit] = true;
				}
				base[i] = false;
			}
		}
		// 타자 이동
		if (hit == 4)
			score++;
		else
			base[hit] = true;

		return score;
	}
}