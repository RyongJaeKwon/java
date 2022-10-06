package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class 프로젝트 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 메뉴는?");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(0, 255, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(34, 10, 316, 61);
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("그림");
		btnNewButton.setBounds(34, 81, 316, 201);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("STOP");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setBounds(117, 292, 151, 49);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);

	}

}
