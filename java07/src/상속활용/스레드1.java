package 상속활용;

public class 스레드1 extends Thread{
	
	@Override
	public void run() {
		String[] list = {"우동.png", "짜장면.png", "짬뽕.png"};
		for (int i = 0; i < list.length; i++) {
			System.out.println("이미지 >> " + i);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
