package Bj2108_통계학;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Bj2108_0910 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] arr = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		// 평균구하기
		double sumAll = 0;
		for (int i : arr) {
			sumAll += i;
		}

		int resultA = (int) Math.round(sumAll / T);

		// 중앙값 구하기
		int resultB = arr[(T - 1) / 2];

		// 최빈값 구하기
		List<Integer> list = new ArrayList<>();
		int maxCount = 1;
		int count = 1;
		for (int i = 0; i < T - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				count = 1;
			}

			if (count > maxCount) {
				maxCount = count;
				list.clear();
				list.add(arr[i]);
			} else if (count == maxCount) {
				list.add(arr[i]);
			}
		}
		
		Set<Integer> set = new HashSet<>(list);
		List<Integer> newList = new ArrayList<>(set);
		
		Collections.sort(newList);
		
		int resultC = 0;
		if(newList.size() ==1) {
			resultC = newList.get(0);
		}else if(newList.isEmpty()){
			resultC = arr[0];
		}else {
			resultC = newList.get(1);
		}
		
		// 범위 구하기
		int resultD = arr[T - 1] - arr[0];

		StringBuilder sb = new StringBuilder();
		sb.append(resultA + "\n");
		sb.append(resultB + "\n");
		sb.append(resultC + "\n");
		sb.append(resultD);
		System.out.println(sb.toString());
	}

}
