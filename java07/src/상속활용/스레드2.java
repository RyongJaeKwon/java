package 상속활용;

import javax.swing.JOptionPane;

public class 스레드2 extends Thread{
	@Override
	public void run() {
		String[] food = {"우동", "짜장면", "짬뽕"};
		for (int i = 0; i < food.length; i++) {
			System.out.println("종류 >> " + i);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
