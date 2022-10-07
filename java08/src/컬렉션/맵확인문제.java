package 컬렉션;

import java.util.HashMap;

public class 맵확인문제 {

	public static void main(String[] args) {
		HashMap custom = new HashMap();
		custom.put(100, "김데이");
		custom.put(200, "김사전");
		custom.put(300, "김구조");
		custom.put(400, "김자료");
		System.out.println(custom);
		custom.remove(200);
		custom.replace(300, "김충성");
		System.out.println(custom);

	}

}
