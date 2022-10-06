package 상속;

public class 원더우먼 extends 우먼{
	
	public void 싸우다() {
		System.out.println("악당과 싸우다");
	}

	@Override
	public String toString() {
		return "원더우먼 [gender=" + gender + ", name=" + name + "]";
	}
	
	
}
