package 클래스사용하기;

import 클래스만들기.강아지;
//class의 위치를 지정함.
import 클래스만들기.전화기;

public class 내방프로젝트 {

	public static void main(String[] args) {
		// 전화기 한대 넣어보자
		전화기 p1 = new 전화기();
		
		//p1은 참조형변수(주소)
		//System.out.println(p1);
		p1.size = 11;
		p1.speaker = "바나나사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		p1.통화하다();
		p1.사진을찍다();
		
		// 전화기를 한대 더 추가해보자.
		전화기 p2 = new 전화기();
		p2.size = 22;
		p2.speaker = "가나다";
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		p2.통화하다();
		p2.사진을찍다();
		
		// 강아지 한마리 추가
		강아지 dog = new 강아지();
		dog.color = "흰색";
		dog.field = "말티즈";
		System.out.println(dog.color);
		System.out.println(dog.field);
		dog.꼬리를흔들다();
		dog.짖다();
	}

}
