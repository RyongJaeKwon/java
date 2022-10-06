package 클래스사용하기;

import 클래스만들기.계산기;

public class 내가게 {

	public static void main(String[] args) {
		// 자바는 "입력값이 다르면", 메서드 이름 동일해도 된다
		계산기 cal = new 계산기();
		int result = cal.add(200, 100);
		double result2 = cal.add(200, 22.2);
		double result3 = cal.add(11.1, 22.2);
		int result4 = cal.multi(3000, 4);
		cal.div(result4, 4);
		
		System.out.println("더한 값1은 " + result);
		System.out.println("더한 값2은 " + result2);
		System.out.println("더한 값3은 " + result3);
	}

}
