package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex07_ComboBox extends JFrame{
public Ex07_ComboBox() {
	super("콤보박스");
	
	
	JPanel jp = new JPanel();
	
	//콤보박에스 들어갈 내용을 배열로 만든다.
	String[] items = {"스타벅스","이디야","빽다방","컴포즈","더벤티"};
	JComboBox<String> jcom = new JComboBox<>(items);  
	
	// 특정 항목을 먼저 나오게 하는 방법
	//jcom.setSelectedIndex(3);
	
	jp.add(jcom);
	
	add(jp);
	
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-250, ds.height/2-300, 500, 600);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	

}
	public static void main(String[] args) {
		
new Ex07_ComboBox();
	}

}
