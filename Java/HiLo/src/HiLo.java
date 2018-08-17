import java.util.*;

public class HiLo 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String playAgain;
		playAgain = "";
		do
		{
			int guesses;
			int guess;
			guess = 0;
			guesses = 0;
			int randomNumber;
			randomNumber = (int)(Math.random()*100 + 1);
			while (guess != randomNumber)
			{
				System.out.println("Guesses a number between 1 and 100");
				guess = scan.nextInt();
				guesses++;
				if(guess == randomNumber)
				{
					System.out.println("Congratulations you guessed the number correctly! You did this using " + guesses + " guesses");
				}
				else if (guess < randomNumber)
				{
					System.out.println("Your guess is less than the target number, Please guess again.");
				}
				else
				{
					System.out.println("Your guess is greater than the target number, Please guess again.");
				}
			}//while
			System.out.println("Would you like to play Again (y/n)?");
			playAgain=scan.next();

		}//do
		while(playAgain.equalsIgnoreCase("y"));

		scan.close();
		//System.out.println(randomNumber);
	}//main

}//class
