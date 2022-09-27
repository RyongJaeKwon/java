package 연산자;

public class test02 {

	public static void main(String[] args) {
		double yesterday_weight = 70;
		double today_weight = 67.8;
		
		double total_weight = yesterday_weight - today_weight;
		
		if (total_weight > 2) {
			System.out.println("다이어트 성공!");
		} else {
			System.out.println("다이어트 실패!");
		}

	}

}
