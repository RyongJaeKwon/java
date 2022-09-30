package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기2 {

	public static void main(String[] args) {
		// 1. 작년과 올해 가고싶은 곳 공간만들기
		String place[] = new String[3];
		String place1[] = new String[3];
		
		// 2. 입력받을 부품 만들기
		Scanner sc = new Scanner(System.in);
		
		// 3. 작년 가고싶은 곳 입력받아서 공간에 넣기
		for(int i = 0; i < place.length; i++) {
			System.out.print("작년에 가고 싶었던 곳을 입력하세요 >> ");
			place[i] = sc.next(); 
		}
		
		// 4. 올해 가고싶은 곳 입력받아서 공간에 넣기
		for(int i = 0; i < place1.length; i++) {
			System.out.print("올해 가고 싶었던 곳을 입력하세요 >> ");
			place1[i] = sc.next(); 
		}
		
		// 5. 같은 인덱스 문자열끼리 비교해서 동일하면 hap변수 1씩 증가
		int hap = 0;
		for(int i = 0; i < place.length; i++) {
			if(place[i].equals(place1[i])) {
				hap++;
			}
		}
		
		// 6. 출력
		System.out.println("작년과 올해 가고 싶은 곳이 동일한 곳은 " + hap + "곳 입니다.");
	}

}
