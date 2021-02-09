package alarm;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class alarm {
	public static void main(String[] args) {
		JFrame myWindow = new JFrame("Alarm");
		JButton startAlarm = new JButton();
		JButton stopAlarm = new JButton();
		ImageIcon icon = new ImageIcon("clock.png");
		JLabel currentTime = new JLabel("00:00");
		
		//startAlarm stuff
		startAlarm.setText("Start");
		startAlarm.setBounds(350, 400, 100, 25);
		startAlarm.addActionListener(e -> startTheAlarm(startAlarm, stopAlarm));
		
		//stopAlarm stuff
		stopAlarm.setText("Stop");
		stopAlarm.setBounds(250, 400, 100, 25);
		stopAlarm.addActionListener(e -> stopTheAlarm(startAlarm, stopAlarm));
		stopAlarm.setEnabled(false);
		
		//currentTime stuff
		currentTime.setBounds(0, 0, 200, 100);
		
		//myWindow stuff
		myWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		myWindow.setResizable(false);
		myWindow.setSize(500, 500);
		myWindow.setVisible(true);
		myWindow.setIconImage(icon.getImage());
		myWindow.add(startAlarm);
		myWindow.add(stopAlarm);
		myWindow.add(currentTime);
		myWindow.setLayout(null);
		
		//method calls
		displayTheTime(currentTime);
	}
	
	static void startTheAlarm(JButton startAlarm, JButton stopAlarm){
		startAlarm.setEnabled(false);
		stopAlarm.setEnabled(true);
	}
	
	static void stopTheAlarm(JButton startAlarm, JButton stopAlarm){
		startAlarm.setEnabled(true);
		stopAlarm.setEnabled(false);
	}
	
	static void displayTheTime(JLabel currentTime) {		
		long milliseconds = 0;
		long hours = 0;
		long minutes = 0;
		long seconds = 0;
		
		while(true) {
			milliseconds = System.currentTimeMillis();
			seconds = (milliseconds/1000)%60;
			minutes = (milliseconds/60000)%60;
			hours = (milliseconds/3600000)%24;
			
			currentTime.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
			
			// wait a second to update
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
