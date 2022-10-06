package 정적static;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static int total_age;
	
	public 직원(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		total_age += age;
	}
	
	public static double getAvg() {
		return (double)total_age / count;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
