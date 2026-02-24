package Bj7785_회사에있는사람;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Bj7785_0910 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			String name = sc.next();
			String status = sc.next();
			
			if(status.equals("enter")) {
				set.add(name);
			} else if(status.equals("leave")){
				set.remove(name);
			}
		}
		
		List<String> list = new ArrayList<>(set);
		
		Collections.sort(list, Collections.reverseOrder());
		
		for(String name : list) {
			System.out.println(name);
		}
	}

}
