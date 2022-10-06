package 상속;

public class 맨 extends 사람 {
	int size;
	
	public void 달리다() {
		System.out.println("빨리 달리다.");
	}

	@Override
	public String toString() {
		return "맨 [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
	
	
}
