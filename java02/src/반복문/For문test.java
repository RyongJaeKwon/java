package 반복문;

public class For문test {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 33; i <=222; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		System.out.println("----------------");
		
		int sum2 = 0;
		for(int i = 55; i <= 4500; i+=2) {
			sum2 += i;
		}
		System.out.println(sum2);
		System.out.println("----------------");
		
		int sum3 = 0;
		for(int i = 0; i <= 6000; i+=5) {
			sum3 += i;
		}
		System.out.println(sum3);
		System.out.println("----------------");
		
		int sum4 = 0;
		for(int i = 1; i <= 1000; i+=3) {
			if(sum4 > 100){
				break;
			}
			if (i % 5 == 0) {
				continue;
			}
			sum4 += i;
		}
		System.out.println(sum4);
	}

}
