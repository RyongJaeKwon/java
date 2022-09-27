package 연산자;

public class 네이버로그인 {

	public static void main(String[] args) {
		// 기본형 비교 여러개인 경우
		
		int id = 1111;
		int pw = 2222;
		
		// 입력한  id/pw
		int id2 = 1111;
		int pw2 = 3333;
		
		// 논리연산자 (&&)
		
		if (id == id2 && pw == pw2) {	// 기본형은 연산자를 이용해서 값을 비교할 수 있다.
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
