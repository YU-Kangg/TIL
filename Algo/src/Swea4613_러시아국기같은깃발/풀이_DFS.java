package Swea4613_러시아국기같은깃발;

import java.util.Scanner;

public class 풀이_DFS {
    static int N, M;
    static char[][] board;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            N = sc.nextInt();
            M = sc.nextInt();
            board = new char[N][M];

            for (int i = 0; i < N; i++) {
                board[i] = sc.next().toCharArray();
            }

            answer = Integer.MAX_VALUE;

            // 첫 번째 줄은 무조건 W, 마지막 줄은 무조건 R
            int repaintFirst = repaintCost(0, 'W');
            int repaintLast = repaintCost(N - 1, 'R');

            // DFS 탐색: (현재행 idx, 직전 색상, 누적 repaint, B를 포함했는지 여부)
            dfs(1, 'W', repaintFirst, false, repaintLast);

            System.out.println("#" + tc + " " + answer);
        }
        sc.close();
    }

    // row번째 행을 target색으로 칠하는 데 필요한 repaint 수
    static int repaintCost(int row, char target) {
        int cnt = 0;
        for (int j = 0; j < M; j++) {
            if (board[row][j] != target) cnt++;
        }
        return cnt;
    }

    static void dfs(int row, char prev, int repaintSum, boolean hasBlue, int repaintLast) {
        // 마지막 줄 직전까지 도달한 경우
        if (row == N - 1) {
            // 마지막 줄은 무조건 R
            if (hasBlue) {
                int total = repaintSum + repaintLast;
                answer = Math.min(answer, total);
            }
            return;
        }

        // 흰색 → 파랑 → 빨강 순서만 가능 (W -> W/B, B -> B/R, R -> R)
        if (prev == 'W') {
            // 현재 줄을 W
            dfs(row + 1, 'W', repaintSum + repaintCost(row, 'W'), hasBlue, repaintLast);
            // 현재 줄을 B
            dfs(row + 1, 'B', repaintSum + repaintCost(row, 'B'), true, repaintLast);
        } else if (prev == 'B') {
            // 현재 줄을 B
            dfs(row + 1, 'B', repaintSum + repaintCost(row, 'B'), true, repaintLast);
            // 현재 줄을 R
            dfs(row + 1, 'R', repaintSum + repaintCost(row, 'R'), hasBlue, repaintLast);
        } else if (prev == 'R') {
            // R 이후는 무조건 R
            dfs(row + 1, 'R', repaintSum + repaintCost(row, 'R'), hasBlue, repaintLast);
        }
    }
}
