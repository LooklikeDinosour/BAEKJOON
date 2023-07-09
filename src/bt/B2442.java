package bt;

import java.util.Scanner;

public class B2442 {
	public static void main(String[] args) {		

		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();

		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
