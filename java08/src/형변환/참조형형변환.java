package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 배열의 단점 : 고정된 크기, 같은 타입만 모을 수 있다.
		// ArrayList : 가변 크기, 다른 타입들도 넣을 수 있다.
		ArrayList list = new ArrayList();
		list.add("홍길동");
		// 큰<---작(자동형변환, up casting, 업캐스팅)
		list.add(100);
		list.add(0.2);
		list.add(true);
		list.add(new JButton());
		System.out.println(list.size()); //개수
		
		String name = (String)list.get(0); // 홍길동
		//String(작) <-- Object(큰)
		//강제형변환, down casting, 다운캐스팅
		
		//int <--> Integer <-- Object
		//Integer, Double, Boolean, Character
		//기본형과 관련된 처리를 하기 위해서 부품으로 크게 만들어놓음
		//기본형 + 포장 => 포장클래스(Wrapper클래스)
		int age = (int)list.get(1);
		double eye = (double)list.get(2);
		boolean food = (boolean)list.get(3);
		JButton b = (JButton)list.get(4);
	}

}
