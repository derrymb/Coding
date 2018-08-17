import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame 
{
	private int lives = 0; // only changes once checkGuess method is called
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	public void checkGuess()
	{
		lives++;
		String guessText;
		guessText = txtGuess.getText();
		String message;
		message = "";
		int guess; 
		guess = Integer.parseInt(guessText);
		if(guess < theNumber)
			message=(guess+" is too Low. Try again " + theNumber);
		else if(guess > theNumber)
			message=(guess+" is too High. Try again " + theNumber);
		else
		{
			message=(guess+" is Correct. It took you: " + lives + "guesses. \nCongratulations you Win!!!");
			newGame();
		}	
		lblOutput.setText(message);
		
	}
	public void newGame()
	{
		theNumber = (int)(Math.random()*100 +1);
	}
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Derry's Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblDerrysGuessingGame = new JLabel("Derry's Guessing Game");
		lblDerrysGuessingGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblDerrysGuessingGame.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblDerrysGuessingGame.setBounds(12, 30, 408, 37);
		getContentPane().add(lblDerrysGuessingGame);
		
		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGuessANumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGuessANumber.setBounds(22, 97, 275, 22);
		getContentPane().add(lblGuessANumber);
		
		txtGuess = new JTextField();
		txtGuess.setBounds(304, 98, 94, 22);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setBounds(168, 149, 97, 25);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above \r\nand click guess");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblOutput.setBounds(12, 174, 408, 46);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) 
	{
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450, 300));
		theGame.setVisible(true);
	}
}
