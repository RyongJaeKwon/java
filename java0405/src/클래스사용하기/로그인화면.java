package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 255, 0));
		f.setSize(355, 448);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(22, 151, 95, 52);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 0));
		t1.setBounds(112, 161, 215, 29);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 255, 0));
		t2.setColumns(10);
		t2.setBounds(112, 210, 215, 29);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_2.setBounds(22, 200, 95, 52);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kwon\\Desktop\\java-workspace\\java04\\diary2.png"));
		lblNewLabel_1.setBounds(12, 10, 315, 141);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); //id
				String s2 = t2.getText(); //pw
				
				if (s1.equals("root") && s2.equals("1234")) {
					// 일기쓰기화면창을 띄워라
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();	
				} else {
					JOptionPane.showMessageDialog(f, "입력값이 달라서 로그인실패입니다.");
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\kwon\\Desktop\\java-workspace\\java04\\login1.png"));
		btnNewButton.setBounds(32, 264, 117, 110);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\kwon\\Desktop\\java-workspace\\java04\\logout2.png"));
		btnNewButton_1.setBounds(181, 264, 117, 110);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		f.setVisible(true);
	}
}
