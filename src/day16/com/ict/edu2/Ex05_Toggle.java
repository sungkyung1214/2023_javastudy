package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Ex05_Toggle extends JFrame{
public Ex05_Toggle() {
	super("토글토글");
	
	JPanel jp = new JPanel();
	
	
	JToggleButton jtb1 = new JToggleButton();
	jtb1.setText("영화보기");
	//jrb1.setSelected(true);
	
	JToggleButton jtb2 = new JToggleButton("음악듣기");
	JToggleButton jtb3 = new JToggleButton("넷플보기");
	JToggleButton jtb4 = new JToggleButton("잠자기");
	
	
	jp.add(jtb1);
	jp.add(jtb2);
	jp.add(jtb3);
	jp.add(jtb4);
	
	add(jp);
	
	
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-250, ds.height/2-300, 500, 600);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

}	
	public static void main(String[] args) {
		new Ex05_Toggle();
	}
}
