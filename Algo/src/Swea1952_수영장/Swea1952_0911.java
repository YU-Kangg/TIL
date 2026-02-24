package Swea1952_수영장;

import java.util.Scanner;

public class Swea1952_0911 {
	static int result;
	static int findCost = 0;
	static int dayCost, monthCost, month3Cost;
	static int M = 12;
	static int[] year;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			// 각 이용권의 비용 입력
			dayCost = sc.nextInt();
			monthCost = sc.nextInt();
			month3Cost = sc.nextInt();
			// 1년 이용권을 최소값으로
			result = sc.nextInt();
			
			// 수영장 방문일수 입력
			year = new int[M];
			for (int i = 0; i < M; i++) {
				year[i] = sc.nextInt();
			}
			
			findLowerCost(0);

			System.out.println("#" + tc + " " + result);
		}
	}

	static void findLowerCost(int idx) {
		// 종료조건 : 12월까지 다 돌았을때
		if (idx >= M) {
			result = Math.min(result, findCost);
			return;
		}
		
		// 방문하지 않았다면 다음달로 이동
		if (year[idx] == 0) {
			findLowerCost(idx + 1);
			return;
		}
		
		// 함수가 호출되고 돌아가기때문에 효율이 떨어짐
		// if(findCost > result){
		//		return;
		// }

		// 1일권 썼을때
		if (findCost + year[idx] * dayCost < result) {
			findCost += year[idx] * dayCost;
			findLowerCost(idx + 1);
			findCost -= year[idx] * dayCost;
		}
		
		// 1달권 썼을때
		if (findCost + monthCost < result) {
			findCost += monthCost;
			findLowerCost(idx + 1);
			findCost -= monthCost;
		}
		
		// 3달권 썼을때
		if (findCost + month3Cost < result) {
			findCost += month3Cost;
			findLowerCost(idx + 3);
			findCost -= month3Cost;
		}
	}
}

public class Swea1952_DP {
	//DP, 동적 계획법
	//큰 문제를 작은 문제로 나누고, 그 결과를 저장해 두었다가 재활용해서 전체 문제를 푸는 알고리즘 기법
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 총 테스트 케이스 수
 
        for (int tc = 1; tc <= T; tc++) {
            // 1. 이용권 가격 및 연간 이용 계획 입력받기
            int dayCost = sc.nextInt();
            int monthCost = sc.nextInt();
            int month3Cost = sc.nextInt();
            int yearCost = sc.nextInt();
 
            // 월과 인덱스를 맞추기 위해 배열 크기를 13으로 설정 (인덱스 1~12 사용)
            int[] plan = new int[13];
            for (int i = 1; i <= 12; i++) {
                plan[i] = sc.nextInt();
            }
 
            // 2. DP 배열 선언 및 초기화
            // dp[i]는 i월까지의 누적 최소 비용을 저장
            int[] dp = new int[13];
            dp[0] = 0; // 0월까지의 비용은 0
 
            // 3. 1월부터 12월까지 최소 비용 계산
            for (int i = 1; i <= 12; i++) {
 
                // 방법 1: 1일권 또는 1달권 이용
                // (i-1)월까지의 최소 비용에 이번 달 비용을 더한다.
                // 이번 달 비용은 (이용일수 * 1일권)과 (1달권) 중 더 저렴한 값이다.
                int costForCurrentMonth = Math.min(plan[i] * dayCost, monthCost);
                dp[i] = dp[i-1] + costForCurrentMonth;
 
                // 방법 2: 3달 이용권 이용 (3월부터 고려 가능)
                // i, i-1, i-2월을 3달 이용권으로 묶는 경우.
                // 이 경우, (i-3)월까지의 최소 비용에 3달 이용권 가격을 더한 값과 비교한다.
                if (i >= 3) {
                    dp[i] = Math.min(dp[i], dp[i-3] + month3Cost);
                }
            }
 
            // 4. 최종 결과 도출
            // 12개월까지의 누적 최소 비용(dp[12])과 1년 이용권 가격을 비교하여
            // 가장 저렴한 최종 비용을 선택한다.
            int finalResult = Math.min(dp[12], yearCost);
 
            // 출력
            System.out.println("#" + tc + " " + finalResult);
        }
    }
}
