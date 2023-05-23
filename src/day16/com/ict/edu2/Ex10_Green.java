package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex10_Green extends JPanel {
	public Ex10_Green() {
		setBackground(Color.GREEN);

		JCheckBox jcb1 = new JCheckBox("집");
		JCheckBox jcb2 = new JCheckBox("회사");
		JCheckBox jcb3 = new JCheckBox("도서관");
		JCheckBox jcb4 = new JCheckBox("별장");

		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(jcb4);

	}
}
