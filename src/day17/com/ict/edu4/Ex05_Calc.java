package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//이름명 1개
//패널은 옆으로 가니까 3개 혹은 2개(가운데는 패널 안 넣어도 됨)
public class Ex05_Calc extends JFrame {
	public Ex05_Calc() {
		super("성적계산");
		
		JPanel np1 = new JPanel();
		
		JLabel jl1 = new JLabel("이름 : ");
		JTextField jtf1 = new JTextField(5);
		
		JPanel np2 = new JPanel();
		
		JLabel jl2 = new JLabel("국어 : ");
		JTextField jtf2 = new JTextField(5);
		JLabel jl3 = new JLabel("영어 : "); //연산자 = oper
		JTextField jtf3 = new JTextField(5);
		JLabel jl4 = new JLabel("수학 : "); //연산자 = oper
		JTextField jtf4 = new JTextField(5);
		
		np1.add(jl1);
		np1.add(jtf1);
		np2.add(jl2);
		np2.add(jtf2);
		np2.add(jl3);
		np2.add(jtf3);
		np2.add(jl4);
		np2.add(jtf4);
		
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true); // 자동 줄 바꿈 jta 는 무조건 jscrollpane 과 짝궁
		JScrollPane jsp = new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		// 편집 불가능하게 만들자
		jta.setEditable(false);
		
		JPanel sp =new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		
		
		
		add(np1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	
		
		
		
		
			
		
	}

	public static void main(String[] args) {
		new Ex05_Calc();
	}
}
