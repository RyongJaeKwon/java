package 클래스사용하기;

import 클래스만들기.계좌;

public class 계좌정보프린트 {

	public static void main(String[] args) {
		계좌 account1 = new 계좌();
		account1.name = "홍길동";
		account1.account_name = "튼튼적금";
		account1.amount = 1000;
		
		account1.open();
		
		계좌 account2 = new 계좌();
		account2.name = "박길동";
		account2.account_name = "튼튼예금";
		account2.amount = 2000;
		
		account2.open();
		
		계좌 account3 = new 계좌();
		account3.name = "홍기사";
		account3.account_name = "다음적금";
		account3.amount = 3000;
		
		account3.open();

	}

}
