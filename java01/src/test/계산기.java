package test;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		//jframe, 크기정하고, 보여라. ==> windowbuilder로!
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 128, 128));
		f.setSize(391, 507);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\kwon\\Desktop\\java-workspace\\java01\\계산기.PNG"));
		btnNewButton.setBounds(77, 0, 224, 238);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel.setBounds(150, 248, 95, 39);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_1.setBounds(150, 322, 95, 39);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 17));
		t1.setBounds(77, 285, 224, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 17));
		t2.setColumns(10);
		t2.setBounds(77, 356, 224, 40);
		f.getContentPane().add(t2);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// plus버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다.
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요");
				// 1. 두수를 가지고 온다(String)
				String n1 = t1.getText();	// "100"
				String n2 = t2.getText();	// "200"
				
				// 2. 숫자로 변경해서 정수변수에 넣어준다.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				// 3. 결과 출력
				//JOptionPane.showMessageDialog(f, n11 + n22);
				f.setTitle("더한 결과는 " + (n11 + n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.blue);
				t1.setForeground(Color.red);
			}
		});
		plus.setBackground(new Color(0, 0, 255));
		plus.setFont(new Font("굴림", Font.BOLD, 25));
		plus.setBounds(33, 418, 71, 40);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 눌렀군요");
			}
		});
		minus.setBackground(new Color(0, 255, 0));
		minus.setFont(new Font("굴림", Font.BOLD, 25));
		minus.setBounds(109, 418, 71, 40);
		f.getContentPane().add(minus);
		
		JButton mul = new JButton("*");
		mul.setBackground(new Color(255, 255, 0));
		mul.setFont(new Font("굴림", Font.BOLD, 25));
		mul.setBounds(192, 418, 71, 40);
		f.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.setBackground(new Color(128, 255, 255));
		div.setFont(new Font("굴림", Font.BOLD, 25));
		div.setBounds(270, 418, 71, 40);
		f.getContentPane().add(div);
		f.setVisible(true);


	}

}
