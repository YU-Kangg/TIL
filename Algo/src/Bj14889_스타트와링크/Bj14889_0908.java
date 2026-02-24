package Bj14889_스타트와링크;

import java.util.Scanner;

public class Bj14889_0908 {
    static int N;
    static int[][] map;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 사람 수
        map = new int[N][N];
        visited = new boolean[N];

        // 능력치 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        // N명 중 N/2명을 스타트 팀으로 뽑는 조합
        comb(0, 0);

        System.out.println(min);
    }

    // 조합 함수
    static void comb(int depth, int start) {
        if (depth == N / 2) {
            calculate();
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                comb(depth + 1, i + 1);
                visited[i] = false; // 백트래킹
            }
        }
    }

    // 능력치 차이 계산
    static void calculate() {
        int startSum = 0;
        int linkSum = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    // 스타트 팀 능력치 합
                    startSum += map[i][j] + map[j][i];
                } else if (!visited[i] && !visited[j]) {
                    // 링크 팀 능력치 합
                    linkSum += map[i][j] + map[j][i];
                }
            }
        }

        int diff = Math.abs(startSum - linkSum);
        min = Math.min(min, diff);

        // 최솟값이 0이면 더 볼 필요 없음
        if (min == 0) {
            System.out.println(0);
            System.exit(0);
        }
    }
}
