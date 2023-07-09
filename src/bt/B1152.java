package bt;

import java.util.Arrays;
import java.util.Scanner;

public class B1152 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str1 = scan.nextLine();
		if(str1.equals(" ")) {
			String[] arr = new String[0];
			
			System.out.println(arr.length);
			System.out.println(Arrays.toString(arr));
		} else {
			String str2 = str1.trim(); // trim으로 좌우 공백을 모두 제거
			String[] arr = str2.split(" "); // " " 기준으로 분리하기

			System.out.println(arr.length);
			System.out.println(Arrays.toString(arr));

		}
	}
}
