package day15_0705;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class CheckBoxItemEventEx extends JFrame {
	// 객체 생성
	private JCheckBox [] fruits = new JCheckBox [3];	// 배열 객체 'fruits' (3개의 저장공간)
	private String [] names = {"사과", "배", "체리"};
	private JLabel sumLabel;
	
	// 생성자
	public CheckBoxItemEventEx() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 2000원, 배 2500원, 체리 5900원"));
		
		// 객체 생성
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		
		// 가격 합계를 구하는 메소드
		sumLabel = new JLabel("현재 0 원 입니다.");
		c.add(sumLabel);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		private int sum = 0;	// 가격의 합
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0])
					sum += 2000;
				else if(e.getItem() == fruits[1])
					sum += 2500;
				else
					sum += 5900;
			}
			else {
				if(e.getItem() == fruits[0])
					sum -= 2000;
				else if(e.getItem() == fruits[1])
					sum -= 2500;
				else
					sum -= 5900;
			}
			sumLabel.setText("현재"+ sum + "원 입니다.");
			
		}
	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

}
