package bt;

import java.util.Scanner;

public class B10952 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while( true ) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if (a == 0 && b == 0) {
				break;
			}
			
			System.out.println(a+b);
		}
		scan.close();
	}
}
