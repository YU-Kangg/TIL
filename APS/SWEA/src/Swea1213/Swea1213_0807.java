package Swea1213;

import java.util.Scanner;

public class Swea1213_0807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//testcase 10번 입력받기
		for (int tc = 1; tc <= 10; tc++) {
			//t번째
			int t = sc.nextInt();
			
			//버퍼 비우기
			sc.nextLine();
			
			//String 생성 
			String f = sc.nextLine();
			String st = sc.nextLine();
			
			//String인 st를 char로 쪼개 배열에 넣음
			char[] c = st.toCharArray();

			//결과값 저장할 result 생성
			int result = 0;
			
			//끝에서 f.length만큼 덜 탐색 해야 안넘침
			for (int i = 0; i <= st.length() - f.length(); i++) {
				//append()써서 f의 길이만큼 합쳐서 String에 넣을꺼니깐 StringBuilder 생성
				StringBuilder sb = new StringBuilder();
				
				//f.lenght()만큼의 char를 조립해서 String으로 만들어줄거임
				for (int j = 0; j < f.length(); j++) {
					sb.append(c[i + j]);
				}
				//조립한걸 str에 넣어주고
				String str = sb.toString();
				
				//str이 f와 같으면 result에 1추가
				if(str.equals(f)) {
					result++;
				}
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
