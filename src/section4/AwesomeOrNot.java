package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int randomNumber = new Random().nextInt(3);
	// 3. Print out this variable
System.out.println(randomNumber);
	// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("Name one thing you think is awesome");
	// 5. If the random number is 0
JOptionPane.showMessageDialog(null,"If your number was 0");
	// -- tell the user whatever they entered is awesome!
JOptionPane.showMessageDialog(null,"Your entered answer is awesome!");
	// 6. If the random number is 1
JOptionPane.showMessageDialog(null, "If your number was 1");
	// -- tell the user whatever they entered is ok.
JOptionPane.showMessageDialog(null, "Your entered answer is ok");
	// 7. If the random number is 2
JOptionPane.showMessageDialog(null, "If your number was 2");
	// -- tell the user whatever they entered is boring.
JOptionPane.showMessageDialog(null, "Whatever you entered is boring");
	// 8. If the random number is 3
JOptionPane.showMessageDialog(null,"If your random number was 3");
	// -- write your own answer
JOptionPane.showMessageDialog(null,"Everybody likes the thing you entered");
}

}


