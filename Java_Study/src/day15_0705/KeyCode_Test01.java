package day15_0705;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCode_Test01 extends JFrame {
	private JLabel la = new JLabel();
	private JLabel [] keyMessage;
	
	public KeyCode_Test01() {
		setTitle("Key Code 예제 : 글자 부분만 배경색 주기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		c.setLayout(new FlowLayout());
		
		setSize(400, 200);
		setVisible(true);
		
		keyMessage = new JLabel[1];
		keyMessage[0] = new JLabel(" Ctrl을 클릭하였음 ");
		
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.CYAN);
		}
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container c = (Container)e.getSource();
			la.setText(e.getKeyText(e.getKeyCode()));
			int keyCode = e.getKeyCode();
			keyMessage[0].setText(keyCode+"");
			
			if(e.getKeyCode() == KeyEvent.VK_CONTROL);
				c.setBackground(Color.YELLOW);
		}
	}

	public static void main(String[] args) {
		new KeyCode_Test01();
	}

}
