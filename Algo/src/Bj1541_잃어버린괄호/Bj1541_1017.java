package Bj1541_잃어버린괄호;

import java.util.Scanner;

public class Bj1541_1017 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        sc.close();

        // 1. 뺄셈(-)을 기준으로 식을 나눕니다.
        // 첫 번째 덩어리(빼기 전)와 이후 뺄셈으로 구분되는 덩어리들로 나뉩니다.
        String[] subtractionParts = expression.split("-");

        int result = 0; // 최종 결과

        // 2. 분리된 각 덩어리를 처리합니다.
        for (int i = 0; i < subtractionParts.length; i++) {
            
            // 각 덩어리 안의 숫자들을 모두 더합니다.
            int sumOfPart = calculateAddition(subtractionParts[i]);

            if (i == 0) {
                // 첫 번째 덩어리: 무조건 더해져야 하는 양수
                result += sumOfPart; 
            } else {
                // 두 번째 덩어리부터: 모두 괄호로 묶여져 빼져야 하는 부분
                result -= sumOfPart; 
            }
        }

        System.out.println(result);
    }

    /**
     * 문자열 s를 덧셈(+) 기준으로 나누어 모든 숫자를 더한 값을 반환합니다.
     */
    public static int calculateAddition(String s) {
        // String.split() 대신 Scanner를 사용하여 '+' 기준으로 숫자를 파싱
        // Scanner를 문자열에 연결하고 구분자(delimiter)를 '+'로 설정
        Scanner s_inner = new Scanner(s);
        s_inner.useDelimiter("\\+"); // '+'는 정규식으로 인식되므로, 이스케이프(\\) 필요

        int sum = 0;
        // 다음 토큰(숫자)이 있는 동안 계속 더합니다.
        while (s_inner.hasNextInt()) {
            sum += s_inner.nextInt();
        }
        s_inner.close();
        return sum;
    }
}