package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		// 1. 전체 목록을 프린트
		System.out.println(me);
		
		// 2. 돈 1000을 꺼내서 2000을 더해 프린트
		int money = (int)me.get(0) + 2000;
		System.out.println(money);
		
		// 3. 키 189.1을 꺼내서 10을 더해 프린트
		double height = (double)me.get(1) + 10;
		System.out.println(height);
		
		// 4. 아침여부 false를 꺼내서 아침을 먹었으면 배불러요, 아니면 배고파요
		boolean breakfast = (boolean)me.get(2);
		
		if(breakfast == true) {
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
		}
		
		// 5. 성별 남꺼내서 남이면 주민번호는 1,3이예요 아니면 주민번호는 2,4에요
		char gender = (char)me.get(3);
		
		if(gender == '남') {
			System.out.println("주민번호는 1,3 이에요");
		}else {
			System.out.println("주민번호는 2,4 이에요");
			
		}
		
	}

}
