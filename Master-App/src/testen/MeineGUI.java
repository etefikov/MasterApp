package testen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MeineGUI {

	private JFrame frame;
	private JButton wbutton;
	private JButton zbutton;
	private JPanel panel;
	private JCheckBox checkbox1;
	private JCheckBox checkbox2;
	private JCheckBox checkbox3;
	private JCheckBox checkbox4;
	private JLabel idlabel;
	private JLabel slabel;

	public MeineGUI() {

		/**
		 * Add new Objects for the Gui
		 */
		frame = new JFrame("MeineApp");
		panel = new JPanel();
		wbutton = new JButton("Weiter");
		zbutton = new JButton("Zurück");
		checkbox1 = new JCheckBox("checkbox1");
		checkbox2 = new JCheckBox("checkbox2");
		checkbox3 = new JCheckBox("checkbox3");
		checkbox4 = new JCheckBox("checkbox4");
		slabel = new JLabel("Seite:");
		idlabel = new JLabel("0");
		/**
		 * Add some Objects to the Panel
		 */

		frame.add(panel);
		panel.add(wbutton);
		panel.add(zbutton);
		panel.add(checkbox1);
		panel.add(checkbox2);
		panel.add(checkbox3);
		panel.add(checkbox4);
		panel.add(slabel);
		panel.add(idlabel);

		/**
		 * Set the Size and the Visible of the Frame
		 */

		panel.setBackground(Color.GRAY);
		frame.setVisible(true);
		frame.setSize(100, 500);

	}

}
