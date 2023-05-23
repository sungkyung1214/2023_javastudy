package day19.com.ict.edu2;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//체크박스, 라디오버튼, 토글버튼 => 아이템리스너
//그냥 버튼 => 액션리스너
public class HwCalc extends JFrame implements ActionListener, ItemListener {
	JPanel np;
	JRadioButton jrb1,jrb2,jrb3,jrb4;
	JTextField jtf1, jtf2;
	JTextArea jta;
	JPanel sp;
	JButton jb1,jb2,jb3;
	ButtonGroup bg;
	
	public HwCalc() {
		super("계산기");
		
		np = new JPanel();
		
		
		jtf1 = new JTextField(5);
		jtf2 = new JTextField(5);
		
		
		jrb1 = new JRadioButton(" + ");
		jrb2 = new JRadioButton(" - ");
		jrb3 = new JRadioButton(" * ");
		jrb4 = new JRadioButton(" / ");
		
		//라디오버튼은 반드시 버튼 그룹 만들기
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		
		
		
		np.add(new JLabel("수1 : "));
		np.add(jtf1);
		np.add(new JLabel("수1 : "));
		np.add(jtf2);
		np.add(new JLabel("연산자 : "));
		np.add(jrb1);
		np.add(jrb2);
		np.add(jrb3);
		np.add(jrb4);
		
		
		
		jta = new JTextArea();
		jta.setLineWrap(true); // 자동 줄 바꿈 jta 는 무조건 jscrollpane 과 짝궁
		JScrollPane jsp = new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		// 편집 불가능하게 만들자
		jta.setEditable(false);
		
		sp =new JPanel();
		jb1 = new JButton("계 산");
		jb2 = new JButton("종 료");
		jb3 = new JButton("취 소");
		
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		
		
		add(np,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	
		
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton obj = (JButton)e.getSource();
			if(obj == jb1) {
				
				if(jrb1.isSelected()) {
					int num1= Integer.parseInt(jtf1.getText());
					int num2= Integer.parseInt(jtf2.getText());
					int plus= num1+num2;
					jta.append(num1 + "+" + num2 + "=" + plus + "\n");
				}else if(jrb2.isSelected()) {
					int num1= Integer.parseInt(jtf1.getText());
					int num2= Integer.parseInt(jtf2.getText());
					int miu= num1 - num2;
					jta.append(num1 + "-" + num2 + "=" + miu+ "\n");
				}else if(jrb3.isSelected()){
					int num1= Integer.parseInt(jtf1.getText());
					int num2= Integer.parseInt(jtf2.getText());
					int mul = num1*num2;
					jta.append(num1 + "*" + num2 + "=" + mul+ "\n");
				}else if(jrb4.isSelected()){
					int num1= Integer.parseInt(jtf1.getText());
					int num2= Integer.parseInt(jtf2.getText());
					int div = num1/num2;
					jta.append(num1 + "/" + num2 + "=" + div+ "\n");
				}
				
				
				
				
				
			}else if(obj == jb2) {
				System.exit(0);
			}else if(obj == jb3) {
				jta.setText("");
				jtf1.setText("");
				jtf2.setText("");
				bg.clearSelection();
//				jrb1.setSelected(false);
//				jrb2.setSelected(false);
//				jrb3.setSelected(false);
//				jrb4.setSelected(false);
			}
		}
		
		
		
	

	public static void main(String[] args) {
		new HwCalc();
	}

	
	}

	
