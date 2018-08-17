
public class testingMethods 
{
	public static int addName(int howMany, int total, switchSportyMan[] sportsArray, switchSportyMan addMan)
	{
		int i = 0;
		int place = 0 ;
		while(total < sportsArray[i].getTotal())
		{
			place = i;
			i++;
		}
		for(int j = howMany; j > place; j--)
		{
			sportsArray[j] = sportsArray[j-1];
		}
		sportsArray[place] = addMan;
		howMany++;
		return howMany;
	}
	public static int delName(int howMany, switchSportyMan[] sportsArray, String delName)
	{
		int i = 0;
		while(i < howMany && delName.equals(sportsArray[i].getName()) == false)
		{
			i++;
		}
		if (i == howMany)
		{
			System.out.println("That name was not found in the Array");
		}
		else
		{
			for(int j = i; j < howMany; j++)
			{
				sportsArray[j] = sportsArray[j+1];
			}
			howMany--;
			System.out.println(delName + " was deleted!");
		}
		
		
		return howMany; 
	}
}
