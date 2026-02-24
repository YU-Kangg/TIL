package Swea8931;

import java.util.Scanner;
import java.util.Stack;

public class Swea8931_0807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			//테스트 케이스 개수 입력
			int c = sc.nextInt();
			
			// 결과값 저장해둘 result 생성
			int result = 0;
			
			//0이나오면 최근에 썼던 돈을 지울꺼니까 stack사용
			Stack<Integer> st = new Stack<>();
			
			//테스트 케이스 개수 만큼 num 배열 생성
			int[] num = new int[c];
			
			//테스트 케이스 개수만큼 입력 받아서 num배열에 넣기
			for (int i = 0; i < c; i++) {
				num[i] = sc.nextInt();
			}
			
			for (int i = 0; i < c; i++) {
				//num[i] 가 0이 아니면
				if (num[i] != 0) {
					
					//stack에 push
					st.push(num[i]);
					
				//num[i] 가 0이면
				} else {
					//날려
					st.pop();
				}
			}
			//stack이 빌만큼 꺼내서 더해주기
			while(!st.isEmpty()) {
				result += st.pop();
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}

}
