package Swea1767_프로세서연결하기;

import java.util.*;

public class Swea1767_0828 {
    static int N, maxCore, minLen;
    static int[][] board;
    static List<int[]> cores;
    static int[] dr = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            N = sc.nextInt();
            board = new int[N][N];
            cores = new ArrayList<>();

            // 입력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    board[i][j] = sc.nextInt();
                    // 내부 코어만 리스트에 저장
                    if (board[i][j] == 1) {
                        if (i != 0 && j != 0 && i != N - 1 && j != N - 1) {
                            cores.add(new int[]{i, j});
                        }
                    }
                }
            }

            maxCore = 0;   // 연결된 코어 최대 개수
            minLen = Integer.MAX_VALUE; // 전선 길이 최소 합

            dfs(0, 0, 0);

            System.out.println("#" + tc + " " + minLen);
        }
    }

    // idx: 현재 처리할 코어 인덱스
    // connected: 지금까지 연결한 코어 개수
    // length: 지금까지 사용한 전선 길이 합
    static void dfs(int idx, int connected, int length) {
        // 모든 코어 처리 완료
        if (idx == cores.size()) {
            if (connected > maxCore) {
                maxCore = connected;
                minLen = length;
            } else if (connected == maxCore) {
                minLen = Math.min(minLen, length);
            }
            return;
        }

        int[] core = cores.get(idx);
        int r = core[0];
        int c = core[1];

        // 4방향 시도
        for (int d = 0; d < 4; d++) {
            int len = canConnect(r, c, d);
            if (len > 0) { // 연결 가능
                setLine(r, c, d, 2); // 전선 깔기 (2로 표시)
                dfs(idx + 1, connected + 1, length + len);
                setLine(r, c, d, 0); // 전선 지우기 (백트래킹)
            }
        }

        // 연결하지 않는 경우도 고려
        dfs(idx + 1, connected, length);
    }

    // (r,c)에서 방향 d로 전선 연결 가능하면 길이 리턴, 불가능하면 0
    static int canConnect(int r, int c, int d) {
        int nr = r + dr[d];
        int nc = c + dc[d];
        int len = 0;

        while (0 <= nr && nr < N && 0 <= nc && nc < N) {
            if (board[nr][nc] != 0) return 0; // 다른 코어나 전선에 막힘
            nr += dr[d];
            nc += dc[d];
            len++;
        }
        return len;
    }

    // (r,c)에서 방향 d로 전선 깔거나 지우기 (val=2면 전선, 0이면 지움)
    static void setLine(int r, int c, int d, int val) {
        int nr = r + dr[d];
        int nc = c + dc[d];
        while (0 <= nr && nr < N && 0 <= nc && nc < N) {
            board[nr][nc] = val;
            nr += dr[d];
            nc += dc[d];
        }
    }
}
