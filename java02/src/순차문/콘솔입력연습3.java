package 순차문;

import java.util.Scanner;

public class 콘솔입력연습3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나의 이름은? ");
		String name = sc.next();
		System.out.print("나의 키는? ");
		Double height = sc.nextDouble();
		System.out.print("나의 몸무게는? ");
		Double weight = sc.nextDouble();
		System.out.print("나는 저녁을 먹었나요? ");
		Boolean eat = sc.nextBoolean();
		System.out.print("나의 좌우명은? ");
		sc.nextLine();
		String way = sc.nextLine();
		
		System.out.println("-------------------");
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 내년 키는 " + height + "입니다.");
		System.out.println("내 내년 몸무게는 " + weight + "입니다.");
		System.out.println("나는 저녁을 " + eat + "했습니다.");
		System.out.println("나의 좌우명은 " + way + "입니다.");

	}

}
