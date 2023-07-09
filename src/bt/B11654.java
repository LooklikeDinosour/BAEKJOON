package bt;

import java.util.Scanner;

public class B11654 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		char c = str.charAt(0);
				
		
		if ('a' <= c && c <= 'z') {
			System.out.println((int)c);
		}
		if ('A' <= c && c <='Z') {
			System.out.println((int)c);
		} 
		if ('0' <= c && c <= '9') { // char 타입으로 구분짓는 '' 빼먹지 말기
			System.out.println((int)c);
		} 	
		scan.close();
	}
}
