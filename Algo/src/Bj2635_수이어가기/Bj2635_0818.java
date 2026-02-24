package Bj2635_수이어가기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj2635_0818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력받기
		int num = sc.nextInt();
		// 결과값 저장할 리스트 생성
		List<Integer> result = new ArrayList<>();

		// 1부터 입력받은 수까지 하나씩 다 해봐서 list.size()가 가장 큰 값 찾을꺼임
		for (int i = 1; i <= num; i++) {
			// 결과값과 비교할 리스트 생성
			List<Integer> list = new ArrayList<>();
			// 처음에 입력받은 숫자 넣고
			list.add(num);
			// 두번째 수 넣고
			list.add(i);

			// break 걸릴때까지
			while (true) {

				// 1부터 돌수있는대까지
				for (int j = 1;; j++) {

					// 넣은게 음수면 제거하고 break
					if (list.get(j) < 0) {
						list.remove(j);
						break;
					}

					// j-1값과 j뺴서 리스트에 더하기
					list.add(list.get(j - 1) - list.get(j));
				}

				// list.size() 가 result.size() 보다 크면
				if (list.size() > result.size()) {
					// 바꾸기
					result = list;
					break;
				} else {
					break;
				}
			}
		}

		System.out.println(result.size());
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
	}

}
