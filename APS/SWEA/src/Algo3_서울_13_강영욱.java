import java.util.Scanner;

public class Algo3_서울_13_강영욱{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트케이스 수

        for (int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            long[][] grid = new long[N][N]; // 합이 커질 수 있으니 long 권장

            for (int k = 0; k < K; k++) {
                int r = sc.nextInt(); // 1-based
                int c = sc.nextInt(); // 1-based
                int w = sc.nextInt(); // 초기 무게
                int s = sc.nextInt(); // 퍼져나가는 힘 (증가면 양수, 감소면 음수)

                int rr = r - 1;
                int cc = c - 1;
                // 각 칸에 대해 Chebyshev 거리 d = max(|i-rr|, |j-cc|)
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        int d = Math.max(Math.abs(i - rr), Math.abs(j - cc));
                        int contrib = w + s * d;
                        if (contrib > 0) {
                            grid[i][j] += contrib;
                        }
                        // 음수면 0 기여(무시)
                    }
                }
            }

            long total = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                	total += grid[i][j];
                }
            }

            System.out.println(total);
        }

        sc.close();
    }
}