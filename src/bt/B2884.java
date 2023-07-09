package bt;

import java.util.Scanner;

public class B2884 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		int result = 0;
				
		if(h == 0 && m >= 45) {
			h = 24;
			result = (60 * h) - 45;
		} else { 
		result = ((60 * h) + m) - 45;
		}
		
		System.out.print((result / 60) + " ");
		System.out.println((result % 60));
		
	}
}
