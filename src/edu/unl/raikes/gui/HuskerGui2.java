package edu.unl.raikes.gui;

import java.awt.*;
import javax.swing.*;

/**
 * This is HuskerGui2.java, packaged within edu.unl.raikes.day39.
 */
public class HuskerGui2 {
	
	/**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setTitle("Husker Fan");
		frame.setSize(new Dimension(500, 350));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button1 = new JButton();
		button1.setText("GO BIG RED!");
		button1.setBackground(Color.RED);
		button1.setForeground(Color.WHITE);
		button1.setPreferredSize(new Dimension(150,100));


		// required for mac, which is quirky
		button1.setOpaque(true);
		button1.setBorderPainted(false);

		frame.add(button1);

		frame.setVisible(true);
	}
}