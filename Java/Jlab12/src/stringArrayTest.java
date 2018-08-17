
public class stringArrayTest 
{
	public static int findWord(String[] newArray, int arrayLong)
	{
		int place;
		place = -1;
		for (int i = 0; i < arrayLong; i++)
		{
			if(newArray[i].charAt(0) == newArray[i].charAt(1))
			{
				place = i;
			}
			
		}
		return place;
	}
	
	public static void main(String[] args) 
	{
		String[] myArray;
		final int HOWLONG;
		HOWLONG = 4;
		myArray = new String[HOWLONG];
		int wordPlace;
		
		
		
		for (int i = 0; i < 4; i++)
		{
			System.out.println("Please enter a name");
			myArray[i] = EasyIn.getString();
		}
		wordPlace = findWord(myArray, HOWLONG);
		
		if(wordPlace == -1)
		{
			System.out.println("None of your words had the first and last characters the same");
		}
		else
		{
			System.out.println("The last word that you entered that has the same 1st and 2nd character was:");
			System.out.println(myArray[wordPlace]);
		}
	}
}
