package edu.unl.raikes.gui;

import java.awt.*;
import javax.swing.*;

/**
 * This is HuskerGui.java, packaged within edu.unl.raikes.day39.
 */
public class HuskerGui {
	
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

		frame.setVisible(true);
	}
}