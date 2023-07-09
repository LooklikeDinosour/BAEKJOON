package bt;

import java.util.Scanner;

public class B9086 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			String s = scan.next();
			int result1 = s.charAt(0);
			int result2 = s.charAt(s.length()-1);
		System.out.print((char)result1);
		System.out.println((char)result2);
		}
	}
}
