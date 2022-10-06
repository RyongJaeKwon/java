package 상속;

public class 상속사용2 {

	public static void main(String[] args) {
		직원 work = new 직원();
		work.name = "홍길동";
		work.salary = 200;
		work.address = "서울시";
		work.rrn = 1;
		System.out.println(work);
		
		매니저 work2 = new 매니저();
		work2.name = "고길동";
		work2.salary = 180;
		work2.address = "하남시";
		work2.rrn = 2;
		work2.bonus = 50;
		System.out.println(work2);

	}

}
