package alarm;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class alarm {
	JButton setAlarm;
	
	public static void main(String[] args) {
		JFrame myWindow = new JFrame("Alarm");
		setAlarm = new JButton();
		ImageIcon icon = new ImageIcon("clock.png");
		
		setAlarm.setText("Start");
		setAlarm.setBounds(350, 400, 100, 25);
		setAlarm.addActionListener(e -> System.out.print("asdf\n"));
		
		myWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		myWindow.setResizable(false);
		myWindow.setSize(500, 500);
		myWindow.setVisible(true);
		myWindow.setIconImage(icon.getImage());
		myWindow.add(setAlarm);
		myWindow.setLayout(null);
	}
}
