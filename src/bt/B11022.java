package bt;

import java.util.Scanner;

public class B11022 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int i = 1;
		while(i <= t) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			

			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
			i++;
		}
		scan.close();
	}
}
