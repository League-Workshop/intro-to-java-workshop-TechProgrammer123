package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String Answer = JOptionPane.showInputDialog("Do you know how to write binary?");
		// 2. If they say "yes", tell them they will rule the world.
if(Answer.equals("01011001 01100101 01110011")) {
JOptionPane.showMessageDialog(null, "You will rule the world");
}
		// 3. Otherwise, wish them good luck washing dishes.
else {
	JOptionPane.showMessageDialog(null, "Wish u luck washing dishes");
}
	}
}

