package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 중국집주문화면 {
	static int count;	// 전역변수는 자동 초기화
	final static int PRICE = 5000;	// 상수는 final을 붙여서 변경불가능으로 설정
	static int jjam_count = 0;
	static int U_count = 0;
	static int jja_count = 0;
	
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.getContentPane().setBackground(new Color(0, 128, 192));
		f.setSize(620, 319);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(349, 18, 68, 34);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 17));
		t1.setBackground(new Color(255, 255, 0));
		t1.setBounds(402, 18, 116, 30);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel result = new JLabel("결제금액");
		result.setForeground(new Color(255, 0, 0));
		result.setFont(new Font("굴림", Font.BOLD, 20));
		result.setBackground(new Color(255, 255, 255));
		result.setBounds(86, 219, 390, 51);
		f.getContentPane().add(result);
		
		JLabel center = new JLabel("");
		// 라벨에 이미지를 변경하고 싶으면, 이미지 객체를 만들고 라벨에 세팅
		ImageIcon img = new ImageIcon("짜장면.png");
		center.setIcon(img);
		center.setFont(new Font("굴림", Font.BOLD, 20));
		center.setBounds(86, 71, 340, 144);
		f.getContentPane().add(center);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//주문량을 현재 카운트에 하나 플러스
				count++;
				jjam_count++;
				f.setTitle("짬뽕개수 : " + jjam_count + " " + "우동개수 : " + U_count + " " + "짜장개수 : " + jja_count);
				t1.setText(count + "개");
				// center라벨에 있는 이미지 변경
				// 이미지아이콘 객체를 만들어 center라벨에 셋팅
				ImageIcon icon = new ImageIcon("짬뽕.png");
				center.setIcon(icon);
				// result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 255));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(12, 10, 97, 45);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				U_count++;
				f.setTitle("짬뽕개수 : " + jjam_count + " " + "우동개수 : " + U_count + " " + "짜장개수 : " + jja_count);
				t1.setText(count + "개");
				ImageIcon icon = new ImageIcon("우동.png");
				center.setIcon(icon);
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(121, 10, 97, 45);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				jja_count++;
				f.setTitle("짬뽕개수 : " + jjam_count + " " + "우동개수 : " + U_count + " " + "짜장개수 : " + jja_count);
				t1.setText(count + "개");
				ImageIcon icon = new ImageIcon("짜장면.png");
				center.setIcon(icon);
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton_2.setBackground(new Color(128, 255, 255));
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_2.setBounds(230, 10, 97, 45);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);

	}
}
