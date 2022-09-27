package test;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class 나의첫윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		// 1. jframe 부품을 새로 만들어주자.
		JFrame f = new JFrame();
		
		// 2. 새로 만든 부품의 크기를 결정
		f.setSize(500, 500);
		
		textField = new JTextField();
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		f.getContentPane().add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		// 3. 새로 만든 부품 "보여주세요" 설정
		f.setVisible(true);
		
	}

}
