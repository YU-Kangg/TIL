package Swea1216;

import java.util.Scanner;

public class Swea1216_0807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int tc = 1; tc<=10; tc++) {
			int t = sc.nextInt();
			sc.nextLine();
			int result = 0;
			
			char[][] arr = new char[100][100];
			for(int i = 0; i<100; i++) {
				String st = sc.nextLine();
				for(int j = 0; j<100; j++) {
					arr[i][j] = st.charAt(i);
				}
			}
			
			for(int i = 0; i<100; i++) {
				for(int j =0; j<100; j++) {
					for(int k = 0; k<100; k++) {
						if(arr[i][j] == arr[i][k]) {

						}
					}
					
					
					
					
				}
			}
			
			
			
			
		}
		
		
		
	}

}
