package day3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "do you know how to write code");
		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null, "then you will rule the world");
			
			// 1. Ask the user if they know how to write code.

			// 2. If they say "yes", tell them they will rule the world.

			// 3. Otherwise, wish them good luck washing dishes.
		}
		else if (input.equals("no")) {
			JOptionPane.showMessageDialog(null, "good luck washing dishes");
		}
		else {
   JOptionPane.showMessageDialog(null, "that is not an anser");   	
		}
	}
}
