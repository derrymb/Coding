
import java.util.Random;
class Jlabs91b
{
		public static int[] randomNumbers(int max, int howMany) 	// method to select the winning numbers(how many) from a set amount(max)
	{
		int[] randomSequence = new int[max];  						// total numbers that are used in the lotto
        int[] randomSequence2 = new int[howMany];					// how many numbers are drawn
		Random randomNumbers = new Random();
        int i;
        int pointer;

        for (i = 0; i < randomSequence.length; i++ ) 
        {
            if (i == 0)
            {
                randomSequence[i] = 0; 
                
            } 
            else
            { 
                pointer = randomNumbers.nextInt(i+1);
                randomSequence[i] = randomSequence[pointer]; 
                randomSequence[pointer] = i;
            } 
        } 
        for(i = 0; i < max; i++)
        	{
        		randomSequence[i] = randomSequence[i] +1;
        		//System.out.print(" " +  randomSequence[i]);
        	}
        	System.out.println();
       	for (int j = 0; j < howMany; j++) 	
       		{
       			randomSequence2[j] = randomSequence[j];
       			//System.out.println(" " +  randomSequence2[j]);
       		}
		return randomSequence2;
	}
	public static void main(String[] args)
	{
        int totalLottoNum;
		int numDrawn;
		int numSelection;
		int[] winningNumbers;
		int[][] tickets;
		int[] lines;
		int[][] winningTickets;
		
		System.out.println("Please enter how many numbers are used in your prefered lotto: ");
		totalLottoNum = EasyIn.getInt();
		System.out.println("Now please enter how many numbers are used in each player ticket: ");
		numDrawn = EasyIn.getInt();
		System.out.println("Now please enter how many tickets there are");
		numSelection = EasyIn.getInt();
		winningNumbers = new int[numDrawn];
		winningNumbers = randomNumbers(totalLottoNum, numDrawn);
		tickets = new int[numSelection][numDrawn];
		winningTickets = new int[numSelection][numDrawn];
		lines = new int[numDrawn];
		
		System.out.print("Winning numbers = {");
		for(int i = 0; i < numDrawn; i++)
        	{
        		System.out.print(winningNumbers[i]+ ","); 
        		
        	}
        System.out.print("}");
        
        for(int j = 0; j < numSelection; j++)
        	{
        		lines = randomNumbers(totalLottoNum, numDrawn);
        		for (int k = 0; k < numDrawn; k++)
        			{
        				winningTickets[j][k] = -1;
        				tickets[j][k] = lines[k];
        				System.out.print(lines[k] + ", ");
        			}
        	}
        for(int l = 0; l < numSelection; l++)
        	{
        		for(int m = 0; m < numDrawn; m++)
        			{
        				for(int n = 0; n < numDrawn; n++)
        					{
        						if(tickets[l][m]==winningNumbers[n])
        							{
        								winningTickets[l][m] = winningNumbers[n];
        							}
        					}
        			}
        	}
        
        for(int o = 0; o < numSelection; o++)
        	{
        		System.out.println();
        		System.out.print("Your winning numbers on ticket " + (o+1) + " are: ");
        		for (int p = 0; p < numDrawn; p++)
        			{
        				if (winningTickets[o][p] != -1)
        					{
        						System.out.print(winningTickets[o][p] + ", ");
        					}
        				
        			}
        	}
        System.out.println();		
	}
}