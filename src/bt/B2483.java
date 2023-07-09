package bt;

import java.util.Scanner;

public class B2483 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		for(int i = 1; i <= s; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
