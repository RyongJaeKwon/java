package 크롤링;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 주식정보크롤링 {
	private static JTextField t1;
	static JTextArea t2;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 주식 크롤링");
		f.getContentPane().setBackground(new Color(128, 128, 192));
		f.setSize(300,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 33));
		lblNewLabel.setBounds(80, 160, 124, 54);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("굴림", Font.BOLD, 22));
		t1.setBackground(new Color(0, 255, 0));
		t1.setBounds(38, 204, 203, 30);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JTextArea t2 = new JTextArea();
		t2.setForeground(new Color(128, 64, 64));
		t2.setFont(new Font("굴림", Font.BOLD, 24));
		t2.setBounds(38, 288, 203, 163);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("삼성전자");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code를 주면서 크롤링해달라고 요구하자
				// 크롤링연습6의 naver(code)호출
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("005930");
				t2.setText(result);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton.setBackground(new Color(255, 128, 255));
		btnNewButton.setBounds(43, 10, 198, 41);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("카카오");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("035720");
				t2.setText(result);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.setBounds(43, 61, 198, 41);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnLg = new JButton("LG화학");
		btnLg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("051910");
				t2.setText(result);
			}
		});
		btnLg.setFont(new Font("굴림", Font.BOLD, 27));
		btnLg.setBackground(new Color(128, 255, 255));
		btnLg.setBounds(43, 112, 198, 41);
		f.getContentPane().add(btnLg);
		
		JButton btnNewButton_3 = new JButton("크롤링시작");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = t1.getText();
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver(code);
				t2.setText(result);
				
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 22));
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(59, 244, 160, 34);
		f.getContentPane().add(btnNewButton_3);
		f.setVisible(true);

	}
}
