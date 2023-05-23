package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//패널 두개를 만들어서 위에는 textarea
//아래는 버튼으로 

public class Ex04_Calc extends JFrame {
public Ex04_Calc() {
	super("계산기");
	
	//위에 텍스트필드 만들기
	JPanel jp1 = new JPanel();
	JTextField jtf = new JTextField(25);
	jp1.add(jtf);
	
	add(jp1);
	add(jp1,BorderLayout.NORTH);
	
	
	//아래 버튼 만들기
	
	JPanel jp2 = new JPanel();
	jp2.setLayout(new GridLayout(5, 4, 7, 7));

	String btn[] = {"1","2","3","4","5","6","7","8","9","0","+","-","*","/","="};
	//jp2.setLayout(new GridLayout(5, 4, 10, 10));
	//아래줄에서 레이아웃 지정할때랑 윗줄에서 지정할때 차이점???
	JButton button[] = new JButton[btn.length];
	 for (int i = 0; i < btn.length; i++) {
	        button[i] = new JButton(btn[i]);
	        jp2.add(button[i]);
	        
	 }
	
	 //add(jp2,BorderLayout.SOUTH);
	add(jp2,BorderLayout.CENTER);
	
	
	
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	
	
	
	
	
	public static void main(String[] args) {
	new	Ex04_Calc();

	}

}
