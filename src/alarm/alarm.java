package alarm;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class alarm {
	public static void main(String[] args) {
		JFrame myWindow = new JFrame("Alarm");
		JButton startAlarm = new JButton();
		JButton stopAlarm = new JButton();
		ImageIcon icon = new ImageIcon("clock.png");
		
		//startAlarm stuff
		startAlarm.setText("Start");
		startAlarm.setBounds(350, 400, 100, 25);
		startAlarm.addActionListener(e -> startTheAlarm(startAlarm, stopAlarm));
		
		//stopAlarm stuff
		stopAlarm.setText("Stop");
		stopAlarm.setBounds(250, 400, 100, 25);
		stopAlarm.addActionListener(e -> stopTheAlarm(startAlarm, stopAlarm));
		stopAlarm.setEnabled(false);
		
		//myWindow stuff
		myWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		myWindow.setResizable(false);
		myWindow.setSize(500, 500);
		myWindow.setVisible(true);
		myWindow.setIconImage(icon.getImage());
		myWindow.add(startAlarm);
		myWindow.add(stopAlarm);
		myWindow.setLayout(null);
	}
	
	static void startTheAlarm(JButton startAlarm, JButton stopAlarm){
		startAlarm.setEnabled(false);
		stopAlarm.setEnabled(true);
	}
	
	static void stopTheAlarm(JButton startAlarm, JButton stopAlarm){
		startAlarm.setEnabled(true);
		stopAlarm.setEnabled(false);
	}
}
