package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드사용2 extends JFrame{
	JLabel image, kind;
	스레드1 list2;
	스레드2 kind2;
	static 스레드사용2 f;
	
	public 스레드사용2() {
		getContentPane().setBackground(Color.yellow);
		setSize(500, 500);
		image = new JLabel("음식");
		kind = new JLabel("음식이름");
		Font font = new Font("궁서", Font.BOLD, 30);
		kind.setFont(font);
		
		add(image, BorderLayout.CENTER);
		add(kind, BorderLayout.SOUTH);
		setVisible(true);
		
		list2 = new 스레드1();
		kind2 = new 스레드2();
		
		list2.start();
		kind2.start();
	}

	public static void main(String[] args) {
		f = new 스레드사용2();

	}
	
	public class 스레드1 extends Thread{
		
		@Override
		public void run() {
			String[] list = {"우동.png", "짜장면.png", "짬뽕.png"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public class 스레드2 extends Thread{
		@Override
		public void run() {
			String[] food = {"우동", "짜장면", "짬뽕"};
			for (int i = 0; i < food.length; i++) {
				kind.setText("음식이름 >> " + food[i]);

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
