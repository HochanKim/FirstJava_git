package day15_0705;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class FlyingTextEx extends JFrame {
	private final int FLYING_UNIT = 20;
	private JLabel la = new JLabel("게임캐릭터");
	
	public FlyingTextEx() {
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		la.setLocation(100, 30);
		la.setSize(500, 500);
		c.add(la);
		setSize(600, 400);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
//		c.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
//				Component com = (Component)e.getSource();
//				com.setFocusable(true);
//				com.requestFocus();
//			}
//		});
	}
	
	// Key 리스너 구현
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
			case KeyEvent.VK_UP :
				la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN :
				la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT :
				la.setLocation(la.getX()-FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT :
				la.setLocation(la.getX()+FLYING_UNIT, la.getY());
				break;
			}
		}
	}

	public static void main(String[] args) {
		new FlyingTextEx();
	}

}
