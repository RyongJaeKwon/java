package 클래스사용하기;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class 파일다루기 {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		
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
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
