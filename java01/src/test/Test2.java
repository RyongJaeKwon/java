package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		//jframe, 크기정하고, 보여라. ==> windowbuilder로!
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 255, 0));
		f.setSize(387, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 48, 146, 37);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 128, 0));
		t1.setBounds(172, 48, 164, 31);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton b1 = new JButton("어디로 갈까?");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				if (s1.equals("커피")) {
					JOptionPane.showMessageDialog(f, "카페로 갑시다.");
				} else {
					JOptionPane.showMessageDialog(f, "물이나 마십시다.");
				}
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		b1.setBounds(22, 95, 314, 37);
		f.getContentPane().add(b1);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 160, 146, 37);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 128, 255));
		t2.setColumns(10);
		t2.setBounds(172, 160, 164, 31);
		f.getContentPane().add(t2);
		
		JButton b2 = new JButton("나의 내년 나이는?");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String age = t2.getText();
				int age1 = Integer.parseInt(age);
				int next_age = age1 + 1;
				
				JOptionPane.showMessageDialog(f, next_age);
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		b2.setBounds(22, 207, 314, 37);
		f.getContentPane().add(b2);
		
		JLabel lblNewLabel_1_1 = new JLabel("국어 점수");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(22, 269, 146, 37);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setBackground(new Color(0, 255, 255));
		t3.setColumns(10);
		t3.setBounds(172, 269, 164, 31);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(new Color(0, 255, 255));
		t4.setColumns(10);
		t4.setBounds(172, 316, 164, 31);
		f.getContentPane().add(t4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("수학 점수");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(22, 316, 146, 37);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton b3 = new JButton("두 과목 점수의 평균은?");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String korean = t3.getText();
				String math = t4.getText();
				
				 int korean1 = Integer.parseInt(korean);
				 int math1 = Integer.parseInt(math);
				 double avg = (double)(korean1 + math1) / 2;
				 
				 JOptionPane.showMessageDialog(f, "두 과목 평균 " + avg);
				 
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 20));
		b3.setBounds(22, 370, 314, 37);
		f.getContentPane().add(b3);
		f.setVisible(true);


	}

}
