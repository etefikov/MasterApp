package testen;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeineGUI {

	JFrame frame;
	JButton wbutton;
	JButton zbutton;
	JPanel panel;

	public MeineGUI() {

		frame = new JFrame("MeineApp");
		panel = new JPanel();
		wbutton = new JButton("Weiter");
		zbutton = new JButton("Zurück");

		frame.add(panel);
		panel.add(wbutton);
		panel.add(zbutton);
		frame.setVisible(true);
		frame.setSize(500, 500);

	}

}
