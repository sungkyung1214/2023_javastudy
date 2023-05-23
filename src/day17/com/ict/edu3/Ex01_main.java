package day17.com.ict.edu3;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex01_main extends JFrame {
	public Ex01_main() {
		super("JTable");
		
		//프레임은 화면에 꽉참 // 패널은 조금 간격을 두고
		
		//패널은 옆에 테이블 가져와야해서 필요한 패널 즉 판대기
		
		//패널은 가장 대표적인 컨테이너
		// ->패널에 붙이면 상단 가운데로 온다
		
		//프레임,패널,테이블  전부 컨테이너
		
		Ex01_JTable table = new Ex01_JTable();
		JTable jTable = new JTable(table); 
		JScrollPane jsp = new JScrollPane(jTable);
		JPanel jp = new JPanel();
		
		//jp.add(jsp);
		
		//add(jp);
		
		add(jsp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	
public static void main(String[] args) {
	new Ex01_main();
}
}
