package Bj1931_회의실배정;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj1931_1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 회의의 수 N 입력
        int N = Integer.parseInt(br.readLine());

        // 2. 회의 정보를 저장할 2차원 배열 (시작 시간, 종료 시간)
        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            time[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
        }

        // 3. 정렬: 종료 시간을 기준으로 오름차순 정렬. 
        //    종료 시간이 같다면 시작 시간을 기준으로 오름차순 정렬.
        Arrays.sort(time, (a, b) -> {
            if (a[1] == b[1]) {
                // 종료 시간이 같을 경우 시작 시간이 빠른 순으로 정렬
                return a[0] - b[0];
            }
            // 종료 시간이 다를 경우 종료 시간이 빠른 순으로 정렬
            return a[1] - b[1];
        });

        int count = 0;      // 최대 회의 개수
        int lastEndTime = 0; // 마지막 회의 종료 시간

        // 4. 그리디 선택
        for (int i = 0; i < N; i++) {
            // 현재 회의의 시작 시간이 이전 회의의 종료 시간보다 같거나 늦으면 선택 가능
            if (time[i][0] >= lastEndTime) {
                lastEndTime = time[i][1]; // 종료 시간 갱신
                count++;                  // 회의 개수 증가
            }
        }

        System.out.println(count);
    }
}