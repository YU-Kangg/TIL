package Test;

public class Test2 {
    public static void main(String[] args) {
        // 2차원 배열 직접 초기화
        int[][] arr = {
            {1,  2,  3,  4,  5},
            {6,  7,  8,  9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        int N = arr.length;        // 행 크기
        int M = arr[0].length;     // 열 크기

        // 탐색할 위치
        int r = 2;  // 3번째 행
        int c = 2;  // 3번째 열

        // 8방향 델타
        int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};

        int sum = 0;
        System.out.print("탐색 위치 (" + r + "," + c + ")의 값: " + arr[r][c] + "\n");
        System.out.print("8방향 이웃 값: ");

        // 8방향 탐색
        for (int i = 0; i < 8; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            // 배열 범위 안인지 체크
            if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                System.out.print(arr[nr][nc] + " ");
                sum += arr[nr][nc];
            }
        }

        System.out.println("\n합계: " + sum);
    }
}