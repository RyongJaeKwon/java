package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Counter {
	static int count;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.getContentPane().setLayout(null);
		
		JLabel center = new JLabel("");
		center.setHorizontalAlignment(SwingConstants.CENTER);
		center.setForeground(new Color(255, 0, 0));
		center.setFont(new Font("궁서", Font.BOLD, 95));
		center.setBounds(25, 54, 235, 177);
		f.getContentPane().add(center);
		center.setText("0");
		
		JButton btnNewButton = new JButton("1더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				center.setText(count + "");
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 64));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 11));
		btnNewButton.setBounds(12, 10, 79, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				center.setText(count + "");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(0, 255, 64));
		btnNewButton_1.setBounds(193, 10, 79, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("0으로초기화");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				center.setText("0");
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 11));
		btnNewButton_2.setBackground(new Color(0, 0, 255));
		btnNewButton_2.setBounds(91, 10, 102, 23);
		f.getContentPane().add(btnNewButton_2);
		
		f.setVisible(true);
	}
}
