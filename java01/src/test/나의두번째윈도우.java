package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class 나의두번째윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		//jframe, 크기정하고, 보여라. ==> windowbuilder로!
				JFrame f = new JFrame();
				f.getContentPane().setBackground(new Color(255, 255, 0));
				f.setSize(500, 500);
				f.getContentPane().setLayout(null);
				
				JLabel lblNewLabel = new JLabel("이름");
				lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 17));
				lblNewLabel.setBounds(27, 45, 108, 48);
				f.getContentPane().add(lblNewLabel);
				
				textField = new JTextField();
				textField.setFont(new Font("굴림", Font.PLAIN, 15));
				textField.setBounds(112, 59, 235, 21);
				f.getContentPane().add(textField);
				textField.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("전화번호");
				lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 17));
				lblNewLabel_1.setBounds(27, 129, 78, 39);
				f.getContentPane().add(lblNewLabel_1);
				
				textField_1 = new JTextField();
				textField_1.setFont(new Font("굴림", Font.PLAIN, 15));
				textField_1.setColumns(10);
				textField_1.setBounds(112, 139, 235, 21);
				f.getContentPane().add(textField_1);
				
				textField_2 = new JTextField();
				textField_2.setFont(new Font("굴림", Font.PLAIN, 15));
				textField_2.setColumns(10);
				textField_2.setBounds(112, 216, 235, 21);
				f.getContentPane().add(textField_2);
				
				JLabel lblNewLabel_1_1 = new JLabel("주소");
				lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 17));
				lblNewLabel_1_1.setBounds(27, 207, 78, 39);
				f.getContentPane().add(lblNewLabel_1_1);
				
				JButton btnNewButton = new JButton("확인");
				btnNewButton.setFont(new Font("굴림", Font.PLAIN, 17));
				btnNewButton.setBounds(49, 305, 97, 23);
				f.getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("취소");
				btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 17));
				btnNewButton_1.setBounds(190, 305, 97, 23);
				f.getContentPane().add(btnNewButton_1);
				f.setVisible(true);


	}
}
