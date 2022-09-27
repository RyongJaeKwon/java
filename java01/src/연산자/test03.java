package 연산자;

import javax.swing.JOptionPane;

public class test03 {

	public static void main(String[] args) {
		String pw1 = "p";
		String pw2 = "q";
		double yesterday_weight = 70;
		double today_weight = 67.8;
		
		double total_weight = yesterday_weight - today_weight;
		
		if (pw1.equals(pw2) && total_weight > 2) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시 도전!");
		}
		
	}

}
