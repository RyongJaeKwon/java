package 반복문;

public class For문연습3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10000; i++) {
			//System.out.println(i);
			sum += i;
		}

		System.out.println(sum);
		System.out.println("----------------");
		//3~11까지 더해보자
		int sum2 = 0;
		for(int i = 1; i <= 11; i++) {
			sum2 += i;
		}
		System.out.println(sum2);
	}

}
