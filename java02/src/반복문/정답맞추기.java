package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100); //0-99까지
		int count = 0;
		int fail = 0;
		// 누적시켜주는 변수의 선언은 반복문안에 넣지않는다.
		
		while (true) {	//무한루프
			String date = JOptionPane.showInputDialog("생각한 숫자 입력");
			count++;	// 증감연산자
			int data2 = Integer.parseInt(date);
			if (data2 == target) {
				System.out.println("정답입니다. 축하합니다.");
				//무한루프를 끝내는 처리해야함
				//break;	// while문 break
				System.out.println("정답은 " + target);
				System.out.println("전체 시도횟수는 " + count);
				System.out.println("틀린횟수는 " + fail);
				System.exit(0); // 정답맞추기 게임 프로그램을 종료
			} else {
				fail++;
				System.out.println("정답이 아닙니다.");
				
				// 입력한 값이 정답보다 큰지, 작은지 알려주기
				if (data2 > target) {
					System.out.println("너무 커요.");
				} else {
					System.out.println("너무 작아요.");
				}
			} 
		}

		//JOptionPane.showMessageDialog(null, "다음에 또 방문해주세요.");
	}

}
