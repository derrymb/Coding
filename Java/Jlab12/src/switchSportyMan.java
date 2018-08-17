
public class switchSportyMan 
{
	String name;
	int points;
	int goals;
	int total;
	
	public switchSportyMan() 
	{
		
	}
	
	public switchSportyMan(String theName, int thePoints, int theGoals, int theTotal) 
	{
		name = theName;
		points = thePoints;
		goals = theGoals;
		total = theTotal;
	}
	
	public String getName() 
	{
		return name;
	}



	public void setName(String name) 
	{
		this.name = name;
	}



	public int getPoints()
	{
		return points;
	}



	public void setPoints(int points) 
	{
		this.points = points;
	}



	public int getGoals()
	{
		return goals;
	}



	public void setGoals(int goals)
	{
		this.goals = goals;
	}



	public int getTotal() 
	{
		return total;
	}



	public void setTotal(int total)
	{
		this.total = total;
	}
	
	public static int setEntry(int total, int noOfElements, switchSportyMan[] sportsArray)
	{
		int place;
		place = 0;
		if (noOfElements == 0)
		{
			return place;
		}
		else 
		{
			int i = 0;
			while(i <= noOfElements && total > sportsArray[i].getTotal())
			{
				if (total > sportsArray[i].getTotal())
				{
					place = i;
					return place;
					
				}
			i++;
			}
		return place;
		}
	}
	/*public static int addName(int noOfElements, switchSportyMan[] sportsArray, switchSportyMan addMan)
	{
		int place;
		place = setEntry(total, noOfElements, sportsArray)
		for (int i = 0; i < noOfElements; i++)
		{
			for(int j = i; j > place; j--)
			{
				sportsArray[j] = sportsArray[j-1];
			}
			sportsArray[place] = currentMan;
		}
		return noOfElements;
	}*/

	public String toString ()

	{
		String myString;
		
		myString = "";
		myString += "\n Name : " + name;
		myString += "\n Points   : " + points;
		myString += "\n Goals  : " + goals;
		myString += "\n Total Score  : " + total;
		
		return myString;
	}
}
