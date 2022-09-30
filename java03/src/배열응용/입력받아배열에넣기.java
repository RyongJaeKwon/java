package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		// 키보드로 입력하는 부품을 ram
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("숫자입력>> ");
			num[i] = sc.nextInt(); // 외부입력은 모두 String, nextInt() String -> int
		}
		int sum = 0;
		for(int x : num) {
			//System.out.println(x);
			sum += x;
		}
		
		System.out.println(sum);
		System.out.println(sum / 5.0);
	}

}
