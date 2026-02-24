package Bj2605_줄세우기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj2605_0812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int student = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<student; i++) {
			int move = sc.nextInt();
			list.add(list.size()-move, i+1);
		}
		
		for(int i = 0; i<student; i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
