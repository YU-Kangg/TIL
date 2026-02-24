package Swea4613_러시아국기같은깃발;

import java.util.Scanner;

public class 풀이_완전탐색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt(); // 행 개수
            int M = sc.nextInt(); // 열 개수
            char[][] board = new char[N][M];

            for (int i = 0; i < N; i++) {
                String line = sc.next();
                board[i] = line.toCharArray();
            }

            int answer = Integer.MAX_VALUE;

            // 흰 - 파랑 - 빨강 구간 나누기
            // wEnd : 흰색 마지막 줄 (최소 0, 최대 N-3)
            // bEnd : 파랑 마지막 줄 (최소 wEnd+1, 최대 N-2)
            for (int wEnd = 0; wEnd < N - 2; wEnd++) {
                for (int bEnd = wEnd + 1; bEnd < N - 1; bEnd++) {
                    int repaint = 0;

                    // 흰색 구간
                    for (int i = 0; i <= wEnd; i++) {
                        for (int j = 0; j < M; j++) {
                            if (board[i][j] != 'W') repaint++;
                        }
                    }

                    // 파랑 구간
                    for (int i = wEnd + 1; i <= bEnd; i++) {
                        for (int j = 0; j < M; j++) {
                            if (board[i][j] != 'B') repaint++;
                        }
                    }

                    // 빨강 구간
                    for (int i = bEnd + 1; i < N; i++) {
                        for (int j = 0; j < M; j++) {
                            if (board[i][j] != 'R') repaint++;
                        }
                    }

                    answer = Math.min(answer, repaint);
                }
            }

            System.out.println("#" + tc + " " + answer);
        }
        sc.close();
    }
}
