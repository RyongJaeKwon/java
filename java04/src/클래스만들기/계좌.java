package 클래스만들기;

public class 계좌 {
	public String name;
	public String account_name;
	public int amount;
	
	public void open() {
		System.out.println("계좌 [이름=" + name + ", 계좌이름=" + account_name + ", 금액=" + amount + "]");
	}
}
