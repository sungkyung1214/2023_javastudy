package day20.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex01_Menu extends JFrame{
	JPanel jp1,jp2,jp3,jp4,jp5,jp6;
	JButton jb1,jb2;
	JTextField jtf;
	JRadioButton jrb1,jrb2,jrb3,jrb4,jrb5,jrb6,jrb7,jrb8,jrb9,jrb10;
	ButtonGroup bg1,bg2,bg3;
	double price = (15000+500)*1.0;
	
	
	public Ex01_Menu() {
		super("피자 주문판");
		
		jp1 = new JPanel();
		jp1.add(new JLabel("자바 피자에 오신것을 환영합니다."));
		
		
		jp2 = new JPanel();
		bg1 = new ButtonGroup();
		jrb1 = new JRadioButton("콤보(15000)",true);
		jrb2 = new JRadioButton("포테이토(20000)");
		jrb3 = new JRadioButton("불고기(30000)");
		bg1.add(jrb1);
		bg1.add(jrb2);
		bg1.add(jrb3);
		jp2.setLayout(new GridLayout(3,1));// 밑으로 내려가는건 배운것 중에 그리드밖에 없음 그래서 그리드로 해줘야함
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.setBorder(BorderFactory.createTitledBorder("종류"));
		
		jp3= new JPanel();
		bg2 = new ButtonGroup();
		jrb4 = new JRadioButton("피망(500)",true);
		jrb5 = new JRadioButton("치즈(1000)");
		jrb6 = new JRadioButton("패패로니(1500)");
		jrb7 = new JRadioButton("베이컨(2000)");
		bg2.add(jrb4);
		bg2.add(jrb5);
		bg2.add(jrb6);
		bg2.add(jrb7);
		jp3.setLayout(new GridLayout(4,1));
		jp3.add(jrb4);
		jp3.add(jrb5);
		jp3.add(jrb6);
		jp3.add(jrb7);
		jp3.setBorder(BorderFactory.createTitledBorder("추가토핑"));
		
		
		jp4 = new JPanel();
		bg3 = new ButtonGroup();
		jrb8 = new JRadioButton("Small(80%)",true);
		jrb9 = new JRadioButton("Medium(100%)");
		jrb10 = new JRadioButton("Large(120%)");
		bg3.add(jrb8);
		bg3.add(jrb9);
		bg3.add(jrb10);
		jp4.setLayout(new GridLayout(3,1));// 밑으로 내려가는건 배운것 중에 그리드밖에 없음 그래서 그리드로 해줘야함
		jp4.add(jrb8);
		jp4.add(jrb9);
		jp4.add(jrb10);
		jp4.setBorder(BorderFactory.createTitledBorder("사이즈"));
		
		
		jp5 = new JPanel();
		jb1 = new JButton("주문");
		jb2 = new JButton("취소");
		jtf = new JTextField(10);
		jtf.setEditable(false);//글자 못 들어가게 하는것
		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jtf);
		
		jp6 = new JPanel();
		jp6.setLayout(new GridLayout(1,3));
		jp6.add(jp2);
		jp6.add(jp3);
		jp6.add(jp4);
		
		
		
		
		add(jp1,BorderLayout.NORTH);
		add(jp6,BorderLayout.CENTER);
		//add(jp2,BorderLayout.WEST);
		//add(jp3,BorderLayout.CENTER);
		//add(jp4,BorderLayout.EAST);
		add(jp5,BorderLayout.SOUTH);
		
		
		
		//pack();
		//setLocationRelativeTo(null);
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-150, 600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	
	}
	
	
	
	public static void main(String[] args) {
		new Ex01_Menu();
	}
}
