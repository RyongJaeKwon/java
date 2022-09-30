package 배열응용;

import java.util.Scanner;

public class String연습 {

	public static void main(String[] args) {
		String s1 = " 011-245-1234 ";
		String s = s1.trim();	// 공백제거
		
		String first = s.substring(0, 3);
		String second = s.substring(4, 7);
		System.out.println(first + " " + second);
		
		// 3. 문자열 비교
		switch (first) {
		case "011":
			System.out.println("SK");
			break;
		case "019":
			System.out.println("LG");
			break;
		default:
			System.out.println("Apple");
			break;
		}
		
		// 4. 문자열의 길이
		if (second.length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		// 5. 문자열의 길이
		if (s.length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		
		
		String s2 = "감자,고구마,양파";
		String[] s3 = s2.split(",");	// ,기준으로 해서 String배열을 만들어준다.
		System.out.println(s3[0]);
		
		String[] s4 = s.split("-");	// {"011", "245", "1234"}
		if (s4[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");

		}
		
	}

}
