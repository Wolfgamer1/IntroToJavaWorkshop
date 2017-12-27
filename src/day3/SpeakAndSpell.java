package day3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell poop");
		
	    
		// 2. Catch the user's answer in a String
		String input = JOptionPane.showInputDialog("spell the world");
		// 3. If the user spelled the word correctly, speak "correct"
        if (input.equals( "poop" )) {
		speak("correct");
        }	
        // 4. Otherwise say "wrong"
	    else {
		speak("wrong");
	    // 5. repeat the process for other words
	    }
		speak("spell burp");
		String burp = JOptionPane.showInputDialog("spell the world");
	    if (burp.equals("burp")
	    
	    
	    
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
}
	}

}


