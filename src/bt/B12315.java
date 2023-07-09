package bt;

import java.util.Scanner;

public class B12315 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		int star = scan.nextInt();
				
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= star; j++) {
				if(i == j || i + j == star+1) {
					System.out.print("*");
				} 
				System.out.print(" ");
			}
		System.out.println();
		}
	}

}
