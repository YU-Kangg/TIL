package Bj3190_뱀;

import java.util.*;

public class Bj3190 {
	static int N, K, L;
	static int[][] board;
	// 우, 하, 좌, 상 (시계 방향 순서)
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static Map<Integer, String> moveInfo = new HashMap<>();

	static class Node {
		int x, y;
		
		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();

		// 벽을 포함하여 N+2 크기로 생성
		board = new int[N + 2][N + 2];
		for (int i = 0; i < N + 2; i++) {
			for (int j = 0; j < N + 2; j++) {
				if (i == 0 || i == N + 1 || j == 0 || j == N + 1) {
					board[i][j] = 1; // 벽
				}
			}
		}

		// 사과 배치 (3으로 표시)
		for (int i = 0; i < K; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			board[r][c] = 3;
		}

		L = sc.nextInt();
		for (int i = 0; i < L; i++) {
			int time = sc.nextInt();
			String dir = sc.next();
			moveInfo.put(time, dir);
		}

		System.out.println(playGame());
	}

	static int playGame() {
		Deque<Node> snake = new LinkedList<>();
		snake.add(new Node(1, 1));
		board[1][1] = 1; // 뱀의 몸을 1로 표시

		int time = 0;
		int d = 0; // 초기 방향: 오른쪽(우)
		int curX = 1, curY = 1;

		while (true) {
			time++;

			// 1. 머리를 다음 칸으로 이동
			int nx = curX + dx[d];
			int ny = curY + dy[d];

			// 2. 충돌 체크 (벽이나 자기 자신)
			if (board[nx][ny] == 1) {
				break;
			}

			// 3. 이동 로직
			if (board[nx][ny] != 3) {
				// 사과가 없으면 꼬리를 줄임
				Node tail = snake.pollLast();
				board[tail.x][tail.y] = 0;
			}

			// 머리 이동 처리
			board[nx][ny] = 1;
			snake.addFirst(new Node(nx, ny));
			curX = nx;
			curY = ny;

			// 4. 방향 전환 확인 (이동이 끝난 후)
			if (moveInfo.containsKey(time)) {
				String turn = moveInfo.get(time);
				if (turn.equals("D")) {
					d = (d + 1) % 4;
				} else {
					d = (d + 3) % 4;
				}
			}
		}

		return time;
	}

}