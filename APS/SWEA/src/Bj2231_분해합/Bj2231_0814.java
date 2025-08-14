package Bj2231_분해합;

import java.util.Scanner;

import javax.security.cert.CertificateParsingException;
import javax.swing.text.html.parser.ParserDelegator;

public class Bj2231_0814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		int N = num.length();
		char[] c = new char[N];
		for(int i = 0; i<N; i++) {
			c[i] = num.charAt(i);
		}
		
		int realnum = 
		
		for(int i = 1; i<N; i++) {
			int count = 0;
			for(int j = 0; j<N; j++) {
				count += c[j] - 32;
			}
			if(i + count == )
		}
		
	}

}
