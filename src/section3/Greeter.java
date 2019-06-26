package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("Whats your name, hehehe");
	JOptionPane.showMessageDialog(null, "hi there, hehehe"+name);
	System.out.println("gReEtEr");
}
}
