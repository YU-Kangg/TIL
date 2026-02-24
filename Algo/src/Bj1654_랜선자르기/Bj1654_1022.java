package Bj1654_랜선자르기;

import java.util.Scanner;
import java.util.Arrays;

public class Bj1654_1022 {
    public static void main(String[] args) {
        // Scanner를 사용하여 입력 처리
        Scanner sc = new Scanner(System.in);

        // K: 이미 가지고 있는 랜선의 개수, N: 필요한 랜선의 개수
        int K = sc.nextInt();
        int N = sc.nextInt();

        // K개의 랜선 길이를 저장할 배열
        int[] lanLines = new int[K];
        // maxLen을 long으로 선언하여 high의 초기값으로 사용, int 오버플로우 방지
        long maxLen = 0; 

        for (int i = 0; i < K; i++) {
            lanLines[i] = sc.nextInt();
            // 입력받은 랜선 길이 중 최댓값을 갱신
            if (lanLines[i] > maxLen) {
                maxLen = lanLines[i];
            }
        }
        
        // Scanner 사용을 마쳤으므로 닫아주는 것이 좋습니다.
        sc.close(); 

        // 이분 탐색 초기화
        long low = 1;      // 탐색 범위의 최소 길이 (0으로 하면 나누기 0 오류 발생 가능)
        long high = maxLen; // 탐색 범위의 최대 길이
        long result = 0;   // N개 이상 만들 수 있는 최대 길이

        while (low <= high) {
            // mid를 long으로 계산하여 low + high 합의 오버플로우 방지
            long mid = (low + high) / 2; 

            // mid 길이로 잘랐을 때 만들 수 있는 총 개수 계산
            long count = 0;
            for (int len : lanLines) {
                // len이 int여도 mid가 long이므로, 연산 결과는 long 타입으로 유지됨
                count += len / mid; 
            }

            if (count >= N) {
                // N개 이상 만들 수 있다면, mid는 가능한 길이
                // 최대 길이를 찾기 위해 탐색 범위를 긴 쪽으로 이동
                result = mid;
                low = mid + 1;
            } else {
                // N개 미만이라면, mid는 너무 길다
                // 탐색 범위를 짧은 쪽으로 이동
                high = mid - 1;
            }
        }

        System.out.println(result);
    }
}