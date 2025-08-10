package Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	
        int N = 5;
        int M = 5;
        int[][]arr = new int[N][M];
    	for(int tc=1; tc<3; tc++) {
    		for(int i =0; i<N; i++) {
    			for(int j=0; j<M; j++) {
    				arr[i][j] = sc.nextInt();
    			}
    		}
    	}

        int r = 2; // 탐색 위치 (행)
        int c = 2; // 탐색 위치 (열)

        // 8방향 (+1칸)
        int[] dr1 = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dc1 = { 0, 0,-1, 1, -1,  1,-1, 1};

        // 8방향 (+2칸)
        int[] dr2 = {-2, 2, 0, 0, -2, -2, 2, 2};
        int[] dc2 = { 0, 0,-2, 2, -2,  2,-2, 2};

        int sum = 0;
        System.out.println("탐색 위치 (" + r + "," + c + ")의 값: " + arr[r][c]);

        System.out.print("+1칸 8방향 이웃 값: ");
        for (int i = 0; i < 8; i++) {
            int nr = r + dr1[i];
            int nc = c + dc1[i];
            if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                System.out.print(arr[nr][nc] + " ");
                sum += arr[nr][nc];
            }
        }

        System.out.print("\n+2칸 8방향 이웃 값: ");
        for (int i = 0; i < 8; i++) {
            int nr = r + dr2[i];
            int nc = c + dc2[i];
            if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                System.out.print(arr[nr][nc] + " ");
                sum += arr[nr][nc];
            }
        }

        System.out.println("\n합계: " + sum);
    }
}