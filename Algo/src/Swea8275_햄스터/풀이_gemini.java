package Swea8275_햄스터;

import java.util.Scanner;

/**
 * SWEA 8275. 햄스터 문제 풀이
 * 알고리즘: DFS(깊이 우선 탐색)를 이용한 백트래킹(Backtracking)
 * 풀이 전략:
 * 1. 1번 우리부터 N번 우리까지 순서대로 햄스터 수를 결정한다.
 * 2. 각 우리에 0마리부터 X마리까지 넣어보며 모든 경우의 수를 재귀적으로 탐색한다.
 * 3. 특정 우리에 햄스터 수를 정할 때마다, 지금까지의 배치가 유효한지 검사한다.
 * 4. 유효하지 않으면 더 이상 탐색하지 않고 이전 단계로 돌아간다 (백트래킹/가지치기).
 * 5. N번 우리까지 모두 성공적으로 채우면 하나의 '해답 후보'가 된다.
 * 6. 이 해답 후보를 기존의 '최적의 해답'과 비교하여 조건에 따라 갱신한다.
 * - 조건 1: 햄스터 총합이 가장 큰 것
 * - 조건 2: 총합이 같다면 사전 순으로 가장 뒤에 오는 것
 */
class 풀이_gemini {
    // 전역 변수(멤버 변수) 선언
    static int N; // 우리의 수
    static int X; // 각 우리에 들어갈 수 있는 최대 햄스터 수
    static int M; // 관찰 기록의 수
    
    static int[][] records; // 관찰 기록(li, ri, si)을 저장할 2차원 배열
    static int[] cages;     // 현재 탐색 중인 각 우리의 햄스터 수를 저장할 배열 (작업 공간)
    static int[] bestSolution; // 최종적으로 찾은 최적의 해답을 저장할 배열
    static int maxSum;      // 최적 해답의 햄스터 총합 (해답 발견 여부를 체크하기 위해 -1로 초기화)

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            // 1. 입력 및 초기화
            N = sc.nextInt();
            X = sc.nextInt();
            M = sc.nextInt();

            records = new int[M][3];
            cages = new int[N + 1]; 
            bestSolution = new int[N + 1];
            maxSum = -1; // 각 테스트 케이스마다 초기화

            for (int i = 0; i < M; i++) {
                records[i][0] = sc.nextInt(); // li
                records[i][1] = sc.nextInt(); // ri
                records[i][2] = sc.nextInt(); // si
            }

            // 2. DFS(백트래킹) 탐색 시작
            findSolution(1);

            // 3. 결과 출력
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append(" ");
            if (maxSum == -1) {
                sb.append(-1);
            } else {
                for (int i = 1; i <= N; i++) {
                    sb.append(bestSolution[i]).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
        sc.close();
    }

    /**
     * DFS를 통해 해답을 탐색하는 재귀 함수
     * @param cageIndex  현재 햄스터 수를 결정할 우리 번호
     */
    public static void findSolution(int cageIndex) {
        // [종료 조건] N개의 우리를 모두 성공적으로 채웠을 경우
        if (cageIndex == N + 1) {
            // 하나의 완전한 '해답 후보'를 찾음
            int currentSum = 0;
            for (int i = 1; i <= N; i++) {
                currentSum += cages[i];
            }

            if (currentSum > maxSum) {
                // 조건 1: 총합이 더 크면 무조건 이 해답으로 교체
                maxSum = currentSum;
                System.arraycopy(cages, 1, bestSolution, 1, N);
            } else if (currentSum == maxSum) {
                // 조건 2: 총합이 같다면, 사전 편찬 순으로 더 뒤에 오는(더 큰) 해답으로 교체
                for (int i = 1; i <= N; i++) {
                    if (cages[i] > bestSolution[i]) {
                        System.arraycopy(cages, 1, bestSolution, 1, N);
                        break;
                    } else if (cages[i] < bestSolution[i]) {
                        break;
                    }
                }
            }
            return;
        }

        // [재귀 호출] 현재 우리(cageIndex)에 햄스터를 0마리부터 X마리까지 넣어보는 모든 경우를 시도
        for (int i = 0; i <= X; i++) {
            cages[cageIndex] = i;

            // [가지치기] 현재까지의 배치가 유효한지 검사
            if (isValid(cageIndex)) {
                // 유효하다면, 다음 우리(cageIndex+1)를 채우러 더 깊이 탐색
                findSolution(cageIndex + 1);
            }
        }
    }

    /**
     * 현재 우리(currentCageIndex)까지의 배치가 유효한지 검사하는 함수
     * @param currentCageIndex 현재 햄스터 수를 채워 넣은 우리 번호
     * @return 유효하면 true, 아니면 false
     */
    public static boolean isValid(int currentCageIndex) {
        // 모든 M개의 기록을 확인합니다.
        for (int i = 0; i < M; i++) {
            int l = records[i][0];
            int r = records[i][1];
            int s = records[i][2];

            // 이 기록을 '지금' 검사할 수 있는지 확인:
            // 기록의 끝 지점(r)이 현재 채워넣은 우리(currentCageIndex)보다 작거나 같을 때
            if (r <= currentCageIndex) {
                int tempSum = 0;
                for (int j = l; j <= r; j++) {
                    tempSum += cages[j];
                }
                
                // 계산한 합이 기록과 일치하지 않으면, 현재 배치는 잘못된 것이므로 즉시 false 반환
                if (tempSum != s) {
                    return false;
                }
            }
        }
        return true;
    }
}