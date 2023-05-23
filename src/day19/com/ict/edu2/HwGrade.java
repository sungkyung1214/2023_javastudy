package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HwGrade extends JFrame implements ActionListener, ItemListener {
	JPanel jp1, jp2, jp3, jp4;
	JTextField name;
	JTextField kor, eng, math;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3;

	public HwGrade() {
		super("성적");

		jp1 = new JPanel();
		name = new JTextField(10);

		jp1.add(new JLabel(" 이 름 : "));
		jp1.add(name);

		jp2 = new JPanel();
		kor = new JTextField(10);
		eng = new JTextField(10);
		math = new JTextField(10);
		jp2.add(new JLabel(" 국 어 : "));
		jp2.add(kor);
		jp2.add(new JLabel(" 영 어 : "));
		jp2.add(eng);
		jp2.add(new JLabel(" 수 학 : "));
		jp2.add(math);

		jta = new JTextArea(20, 0);
		jta.setLineWrap(true); // 자동 줄 바꿈 jta 는 무조건 jscrollpane 과 짝궁
		jta.setEditable(false);
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		jp3 = new JPanel();
		jb1 = new JButton("계 산");
		jb2 = new JButton("종 료");
		jb3 = new JButton("초기화");
		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);

		jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());
		jp4.add(jp2, BorderLayout.NORTH);
		jp4.add(jsp, BorderLayout.CENTER);
		jp4.add(jp3, BorderLayout.SOUTH);

		add(jp1, BorderLayout.NORTH);
		add(jp4, BorderLayout.CENTER);

		// ★★★★★컴포넌트 크기에 맞춰서
		pack();
		// ★★★★화면 중간 설정해주는 애
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		if (obj == jb1) {
			cal();
		} else if (obj == jb2) {
			System.exit(0);
		} else if (obj == jb3) {
			jta.setText("");
			name.setText("");
			kor.setText("");
			eng.setText("");
			math.setText("");
		}

	}
	
	public void cal() {
		String k = name.getText();
		int ko = Integer.parseInt(kor.getText());
		int eg = Integer.parseInt(eng.getText());
		int ma = Integer.parseInt(math.getText());
		
		int sum = ko + eg + ma;
		double avg = (int)(sum/3.0*10)/10.0;
		String grade ="";
		if(avg>=90) {
			grade ="A학점";
		}else if(avg>=80) {
			grade ="B학점";
		}else if(avg>=70) {
			grade ="C학점";
		}else if(avg>60){
			grade ="D학점";
		}else {
			grade ="E학점";
		}
		
		jta.append("이름 : " + k + "\n");
		jta.append("총점 : " + sum + "\n");
		jta.append("평균 : " + avg + "\n");
		jta.append("학점 : " + grade + "\n");
		
	}
	

//		System.out.println("이름 : "+name.getText());
//		System.out.println("총점 : "+name.getText());
//		System.out.println("평균 : "+name.getText());
//		System.out.println("학점 : "+name.getText());
//		jta.append("이름 : "+name.getText()+"\n" +"총점 : "+name.getText());

	

	public static void main(String[] args) {
		new HwGrade();
	}

}
