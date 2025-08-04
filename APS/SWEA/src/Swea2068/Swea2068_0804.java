package Swea2068;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swea2068_0804 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/Swea2068/input (1).txt");

		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		int[] arr = new int[10];
		for (int k = 1; k <= tc; k++) {
			int result = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = sc.nextInt();
				if (result < arr[i]) {
					result = arr[i];
				}
			}
			System.out.println("#" + k + " " + result);
		}
	}

}
