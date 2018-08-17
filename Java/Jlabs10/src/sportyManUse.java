
public class sportyManUse 
{

	public static void main(String[] args) 
	{
		
		sportyMan currentMan;
		String currentName;
		int currentPoints;
		int currentGoals;
		int totalPoints;
		int howMany;
		int place;
		place = 0;
		
		System.out.print("Enter how many sporty men you would like to add to an array? ");
		howMany = EasyIn.getInt();
		sportyMan[] sportsArray;
		sportsArray = new sportyMan[howMany];
		
		for(int i = 0; i < howMany; i++)
		{
			sportsArray[i] = new sportyMan();
		}
		for (int i = 0; i < howMany; i++)
		{
			System.out.print("Enter name ");
			currentName = EasyIn.getString();
			System.out.print("Enter points scored ");
			currentPoints = EasyIn.getInt();
			System.out.print("Enter goals scored ");
			currentGoals = EasyIn.getInt();
			totalPoints = currentPoints + (currentGoals*3);
			currentMan = new sportyMan();
			currentMan.setName(currentName);
			currentMan.setPoints(currentPoints);
			currentMan.setGoals(currentGoals);
			currentMan.setTotal(totalPoints);
			place = sportyMan.setEntry(totalPoints, i ,sportsArray);
			for(int j = i; j > place; j--)
			{
				sportsArray[j] = sportsArray[j-1];
			}
			sportsArray[place] = currentMan;
		}
		for (int i = 0; i < howMany; i++)
		{
			System.out.println(sportsArray[i].toString()); // Print out array to see what order your sportymen are in
		}
		
	}

}
