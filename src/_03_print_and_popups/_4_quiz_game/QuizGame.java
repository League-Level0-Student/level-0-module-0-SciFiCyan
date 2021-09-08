package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2. Ask the user a question
		String input = JOptionPane.showInputDialog("What is the value of x in -2x+(9x)if it equals -22?");
		// 3. Use an if statement to check if their answer is correct

		// 4. if the user's answer was correct, add one to their score
		if (input.equals("-2")) {
			// MAKE MORE QUESTIONS. Ask more questions by repeating the above

			// Option: Subtract a point from their score for a wrong answer
			score = score + 1000;

			// After all the questions have been asked, tell the user their final score
		} else {
			score = score - 1000;

		}
		input = JOptionPane.showInputDialog("What was the most lethal war in history?");

		if (input.equals("World War 2")) {
			
		score = score + 1000;	

		}else
			score = score -2000;{
				
				
			}
input = JOptionPane.showInputDialog("What are the colors you need to make turquoise?");

if (input.equals("blue and green")) {
	
	score = score + 747474;
	
}else
	score = score -1000000000;{
	
	
}
		JOptionPane.showMessageDialog(null, "Your final score is" + score);
	}
}