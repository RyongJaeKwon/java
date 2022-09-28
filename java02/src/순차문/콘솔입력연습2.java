package 순차문;

import java.util.Scanner;

public class 콘솔입력연습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 : 나이
		System.out.println("나에 대한 정보");
		System.out.println("-------------");
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();	// String으로 입력받아서 정수로 변환
		System.out.print("취미 입력 >> ");
		String hobby = sc.next();	
		
		// 출력
		System.out.println("-------------");
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 취미는 " + hobby + "입니다.!");

	}

}
