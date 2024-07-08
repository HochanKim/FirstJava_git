package day15_0705;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);	// 키 입력을 받을 수 있도록 포커스를 준다.
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
//		Container contentPane = getContentPane();
		
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			la.setText(e.getKeyText(e.getKeyCode()));
			
			// '%'키를 판별하기 위해 e.getKeyChar() 호출
			if(e.getKeyChar() == '%')
				contentPane.setBackground(Color.YELLOW);
			// 'F1'키를 판별하기 위해 e.getKeyCode() 호출
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
		}	
	}

	public static void main(String[] args) {
		new KeyCodeEx();
	}

}
