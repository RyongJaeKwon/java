package 정적static;

public class 나의일지 {

	public static void main(String[] args) {
		// 변수는 선언된 위치를 포함한 괄호안에서만 사용가능
		// day1, day2, day3는 메서드 안에서만 쓸 수 있음
		// main안에서만 쓸 수 있는 지역변수(local변수)
		// 지역변수 <---> 전역변수
		// 지역변수는 자동초기화x
		Day day1 = new Day("자바공부", 10, "강남역");
		System.out.println(day1);	// 주소대신 toString이 찍힘
		System.out.println(Day.count);
		System.out.println("전체시간>> " + Day.total_time + "시간");
		System.out.println("평균시간>> " + Day.getAvg() + "시간");
		
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(day2);
		System.out.println(Day.count);
		System.out.println("전체시간>> " + Day.total_time + "시간");
		
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day3);	
		System.out.println(Day.count);
		System.out.println("전체시간>> " + Day.total_time + "시간");
		

	}

}
