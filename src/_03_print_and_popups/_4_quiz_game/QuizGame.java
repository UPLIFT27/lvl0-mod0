package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String one = JOptionPane.showInputDialog(null, "what is 20+20");
		if (one.equals("40")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score += 1;
		} else
			JOptionPane.showMessageDialog(null, "incorrect");
		// 2. Ask the user a question
		String two = JOptionPane.showInputDialog(null, " what color is the sun");
		if (two.equals("yellow")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score += 1;
		} else
			JOptionPane.showMessageDialog(null, "incorrect");

		// 3. Use an if statement to check if their answer is correct

		// 4. if the user's answer was correct, add one to their score

		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answer

		// After all the questions have been asked, tell the user their final score
		JOptionPane.showMessageDialog(null, "your score is " + score);
	}
}
