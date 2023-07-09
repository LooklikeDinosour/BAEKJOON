package bt;

import java.util.Scanner;

public class B25314 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int i = 1; // 0부터 시작하면 0도 포함되서 long 추가생성
		while(i <= n) {
			if(i % 4 == 0) {
				System.out.print("long "); 
			}
			i++;
		}
		System.out.println("int");
		
		System.out.println("------------------------");
		
		for(i = 1; i <= n; i++) {
			if (i % 4 == 0) {
				System.out.print("long ");
			}
		}
		System.out.println("int");
		
		scan.close();
	}
}
