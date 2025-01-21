package edu.unl.raikes.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * This is HuskerGui4.java, packaged within edu.unl.raikes.day39.
 */
public class HuskerGui4 {
	
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
		button1.setPreferredSize(new Dimension(150, 100));
		// required for mac, which is quirky
		button1.setOpaque(true);
		button1.setBorderPainted(false);

		JButton button2 = new JButton();
		button2.setText("Huskers are awesome!");
		button2.setBackground(Color.BLACK);
		button2.setForeground(Color.WHITE);
		button2.setPreferredSize(new Dimension(150, 100));
		// required for mac, which is quirky
		button2.setOpaque(true);
		button2.setBorderPainted(false);

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "An event occurred!");
			}
		});

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "HUSKER");
				JOptionPane.showMessageDialog(frame, "POWER");
			}
		});

		frame.setLayout(new FlowLayout());

		frame.add(button1);
		frame.add(button2);

		frame.setVisible(true);
	}
}