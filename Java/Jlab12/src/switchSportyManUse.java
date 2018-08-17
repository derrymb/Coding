
public class switchSportyManUse 
{
	public static void menu()
	{
		System.out.println("   Menu   ");
		System.out.println(" --------- ");
		System.out.println();
		System.out.println(" 1. Add Name ");
		System.out.println(" 2. Delete   ");
		System.out.println(" 3. List All ");
		System.out.println(" 4. Exit     ");
	}
	public static void clearScreen()
	{
		int index;
		
		for (index = 0; index < 25; index++)
		{
			System.out.println();
		}
	}
	public static int options (int noOfElements, switchSportyMan[] sportsArray)
	{
		char option;
		switchSportyMan currentMan;
		String currentName;
		int currentPoints;
		int currentGoals;
		int place;
		int totalPoints;
		
		menu();
		System.out.println();
		System.out.println("Enter Option Required (1-4) ");
		option = EasyIn.getChar();
		boolean exit;
		exit = false;
		while (exit != true)
		{
			switch(option)
			{
				case '1' : System.out.println("Add Option");
				System.out.print("Enter name ");
				currentName = EasyIn.getString();
				System.out.print("Enter points scored ");
				currentPoints = EasyIn.getInt();
				System.out.print("Enter goals scored ");
				currentGoals = EasyIn.getInt();
				totalPoints = currentPoints + (currentGoals*3);
				currentMan = new switchSportyMan(currentName,currentPoints,currentGoals,totalPoints);
				noOfElements = testingMethods.addName(noOfElements, totalPoints, sportsArray, currentMan);
				//place = switchSportyMan.setEntry(totalPoints, noOfElements, sportsArray);
				EasyIn.pause();
				break;
				case '2' : System.out.println("Delete Option");
				System.out.print("Enter name to be deleted");
				currentName = EasyIn.getString();
				noOfElements = testingMethods.delName(noOfElements, sportsArray, currentName);
				EasyIn.pause();
				break; 
				case '3' : System.out.println("List All");
				for (int i = 0; i < noOfElements; i++)
				{
					System.out.println(sportsArray[i].toString()); // Print out array to see what order your sportymen are in
				}
				EasyIn.pause();
				break;
				case '4' : System.out.println("GoodBye");
				exit = true;
				EasyIn.pause();
				break;
			}
			clearScreen();
			menu();
			System.out.println();
			System.out.println("Enter the Option required (1-4)");
			option = EasyIn.getChar();
			
		}
		return noOfElements;
	}

	public static void main(String[] args) 
	{
		switchSportyMan currentMan;
		String currentName;
		int currentPoints;
		int currentGoals;
		int totalPoints;
		int howMany;
		int place;
		place = 0;
		
		System.out.print("Enter how many sporty men you would like to add to an array? ");
		howMany = EasyIn.getInt();
		switchSportyMan[] sportsArray;
		sportsArray = new switchSportyMan[howMany + howMany];
		
		for(int i = 0; i < howMany; i++)
		{
			sportsArray[i] = new switchSportyMan("",0,0,0);
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
			currentMan = new switchSportyMan(currentName,currentPoints,currentGoals,totalPoints);
			//currentMan.setName(currentName);
			//currentMan.setPoints(currentPoints);
			//currentMan.setGoals(currentGoals);
			//currentMan.setTotal(totalPoints);
			place = switchSportyMan.setEntry(totalPoints, i ,sportsArray);
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
		
		howMany = options(howMany, sportsArray);

	}

}
