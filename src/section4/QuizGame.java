package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 8;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("Do you play sports");
		if(answer.equals("no")){
			System.out.println("Ew you have no life");
		}
		// 3.  Use an if statement to check if their answer is correct
		
		// 4.  if the user's answer was correct, add one to their score 
		if (answer.equals("yes")) {
			System.out.println("good for you");
			
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String question = JOptionPane.showInputDialog("do you play games?");
		if(answer.equals("no")){
			System.out.println("ew");
		}
		if(answer.equals("Yes")) { 
			System.out.println("Lets play together hahaha");
		}	
		
		
		
		
	
		
		
	
			
		// 6.  After all the questions have been asked, print the user's score 
	
		}
	
	
	

}