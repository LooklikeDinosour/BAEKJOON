package bt;

import java.util.Scanner;

public class B10950 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();

		int a = 0;
		int b = 0;
		
		int i = 1;
		while (i <= l) {
			a = scan.nextInt();
			b = scan.nextInt();
			i++;
			System.out.println(a + b);
		}
		scan.close();
	}
}