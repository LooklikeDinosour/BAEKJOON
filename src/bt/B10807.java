package bt;

import java.util.Scanner;

public class B10807 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();  // 첫째줄 입력받은 수

		int count = 0;
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int answer = scan.nextInt(); // 중복되는 값 찾기위해 입력받은수
		for(int i = 0; i < arr.length; i++) {
		if(answer == arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
