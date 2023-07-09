package bt;

import java.util.Scanner;

public class B8393 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int sum = scan.nextInt();
		int sort = scan.nextInt();
		int a = 0;
		int b = 0;
		int result = 0;
		int tmp = 0;

		int i = 1;
		while(i <= sort) {
			a = scan.nextInt();
			b = scan.nextInt();

			result = (a * b);
			tmp += result;
			i++;			
		} if (sum == tmp) {
			System.out.println("Yes");
		} else { 
		System.out.println("No");
		}
		scan.close();
	}
}
