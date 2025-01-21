package edu.unl.raikes.gui;

import javax.swing.*;

/**
 * This is KnockKnockJoke.java, packaged within edu.unl.raikes.day39.
 */
public class KnockKnockJoke {
	
	/**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
	public static void main(String[] args) {
		System.out.println(JOptionPane.YES_OPTION);
		int choice = JOptionPane.showConfirmDialog(null, "Will you please tell me a knock, knock joke?");
		if (choice == JOptionPane.YES_OPTION) {
			String whosThere = JOptionPane.showInputDialog(null,
					"Great, I'll assume you said, \"Knock, knock!\" already. My turn.\nWho's there?");
			String punchline = JOptionPane.showInputDialog(null, whosThere + " who?");
			JOptionPane.showMessageDialog(null, "Oh, ha ha ha, \"" + punchline+"\"\n You're SO funny!");
			
		}
		//System.exit(0);
	}
}
