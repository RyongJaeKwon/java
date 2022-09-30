package 배열기본;

public class 배열test {

	public static void main(String[] args) {
		// int크기 5인 배열 생성
		int[] s = new int[5];
		
		// 배열의 크기를 프린트
		System.out.println(s.length);
		
		// 배열의 첫번째 위치에 100을 넣어서 프린트
		s[0] = 100;
		System.out.println(s[0]);
		
		// 배열의 마지막 위치에 500을 넣어서 프린트
		s[4] = 500;
		System.out.println(s[4]);
		
		// 배열의 3번째 위치에 200을 넣어서 프린트
		s[2] = 200;
		System.out.println(s[2]);
		
		// 배열의 전체 데이터를 프린트
		for(int x : s) {
			System.out.println(x);
		}
		
		// 배열의 전체 데이터를 인덱스와 함께 프린트
		for(int i = 0; i < s.length; i++) {
			System.out.println("s["+i+"]" + " : " + s[i]);
		}

	}

}
