package 조건문;

import java.util.Date;

public class 조건문test3 {

	public static void main(String[] args) {
		Date date =  new Date();
		
		int clock = date.getHours();
		int month = date.getMonth();
		
		if (clock < 11) {
			System.out.println("굿모닝");
		}else if (clock < 15){
			System.out.println("굿애프터눈");
		}else {
			System.out.println("굿나잇");
		}
		
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 7: case 11: 
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}

	}

}
