package bt;

import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {
		
//	      *
//	     **
//	    ***
//	   ****
//	  *****
	
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt() ;
		for(int i = 1; i <= size; i++) {

			//공백
			for(int j = 1; j <= size-i; j++) {
				System.out.print(" ");
			}
			//별찍기
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
