package bt;

import java.util.Scanner;

public class B5597 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] student = new int[10];
		int[] present = new int[8];
		for(int i = 0; i < student.length; i++) { // 출석번호 부여
			student[i] = i+1;
		} // 향for로 가능할거 같은데
		for(int i = 0; i < present.length; i++) { // 과제 확인
			present[i] = scan.nextInt();
		}
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < present.length; j++) {
				if(student[i]==present[j]) {
					student[i] = 0;
				} 
			}
		}
		for(int i = 0; i < student.length; i++) {
			if(student[i] != 0) {
				System.out.println(student[i]);
			}
		}
	}
}
