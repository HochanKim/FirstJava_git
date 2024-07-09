package day17_0709;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);		// 클래스 "Thread"에 있는 메소드 (대기시간을 표현할때 사용)
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}
	
