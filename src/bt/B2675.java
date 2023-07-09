package bt;


import java.util.Scanner;

public class B2675 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int test = scan.nextInt(); // 테스트 개수
		String str = "";
		int num;
		for(int i = 0; i < test; i++) {
			num = scan.nextInt();
			str = scan.next();
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < num; k++) {
					System.out.print(str.charAt(j));
				}
			} System.out.println();
		}
		scan.close();
	}
}

