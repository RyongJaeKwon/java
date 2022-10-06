package 클래스사용하기;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기쓰기화면 {
	// 멤버변수
	private static JTextField t1;
	private static JTextField t2;

	// 멤버메서드
	/**
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 0));
		f.setSize(355, 448);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 34, 132, 52);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 255));
		t1.setBounds(166, 44, 161, 29);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 255, 255));
		t2.setColumns(10);
		t2.setBounds(166, 93, 161, 29);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 제목");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(22, 83, 132, 52);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("오늘의 내용");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(22, 202, 132, 52);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JTextArea t3 = new JTextArea();
		t3.setBounds(166, 163, 161, 134);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
				// 자바프로그램 밖에 있는 자원들을 연결할 때는 프로그램이 실행되지 못하는 위험한 상황으로 인식해서
				// 반드시 위험한 상황이 발생하면 어떻게 처리할지 예외처리 해야함
				try {
					//file.txt와 자바프로그램간 스트림 만듬
					FileWriter file = new FileWriter(s1 + ".txt");
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					//스트림이 닫힐 때 데이터를 다 보냈다고 인식
					file.close();
				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(59, 337, 213, 43);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		f.setVisible(true);
	}
}
