package 연산자;

public class test01 {

	public static void main(String[] args) {
		// 1번 문제
		char pw1 = 'p';
		char pw2 = 'q';
		
		if (pw1 == pw2) {
			System.out.println("PASS!");
		} else {
			System.out.println("재입력!");
		}
		
		// 2번 문제
		double yesterday_weight = 70;
		double today_weight = 67.8;
		
		double total_weight = yesterday_weight - today_weight;
		
		if (total_weight > 2) {
			System.out.println("다이어트 성공!");
		} else {
			System.out.println("다이어트 실패!");
		}
		
		// 3번 문제
		if (pw1 == pw2 && total_weight > 2) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시 도전!");
		}
		
		// 4번 문제
		double exercise = 66;
		double math = 77;
		double english = 88;
		double korean = 99;
		
		double avg = (exercise + math + english + korean) / 4;
		
		System.out.println("평균 : " + avg);
		
		// 5번 문제
		final double pi = 3.14;
		double round = 2.2;
		double area = pi * (round * round);
		
		System.out.println("원의 면적 : " + area);
		
	}

}
