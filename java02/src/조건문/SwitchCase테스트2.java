package 조건문;

import java.util.Date;

public class SwitchCase테스트2 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		// 0 : 일요일 ~ 6 : 토요일
		int day = date.getDay();
		
		switch (day) {
		case 0: case 6:
			System.out.println("놀자.");
			break;
		default:
			System.out.println("자바 공부하러 가자.");
			break;
		}
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
		

	}

}
