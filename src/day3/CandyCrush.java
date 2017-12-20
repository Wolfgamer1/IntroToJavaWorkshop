package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String input = JOptionPane.showInputDialog(null, "who is a person that you don't like ");    
		
			
		
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + input);
		// 3. Ask the user for the name of their best friend
		input = JOptionPane.showInputDialog(null, "what is your best friends name");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, input+" is as sweet as candy ");
		}
}



