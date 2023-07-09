package bt;

import java.util.Scanner;

public class B2793 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int i = 1;
		while (i <= 9) {
			System.out.println(num + " * " + i + " = " + (num*i));
			i++;
		}
		scan.close();
	}
}
