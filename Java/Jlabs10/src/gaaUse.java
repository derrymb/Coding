
public class gaaUse 
{

	public static void main(String[] args) 
	{
		gaa footballer1; // housing list
		String currentName;
		int currentPoints;
		int currentGoals;
		int noOfElements;
		int totalPoints;
		int place;
		noOfElements = 1;
		currentPoints = 0;
		currentGoals = 0;
		totalPoints = 0;
		currentName = "";
		place = 0;
		
		
		for(noOfElements++; noOfElements <= 4;)
		{
			footballer1 = new gaa(); // move into house
			System.out.print("Enter name ");
			currentName = EasyIn.getString();
			System.out.print("Enter points scored ");
			currentPoints = EasyIn.getInt();
			System.out.print("Enter goals scored ");
			currentGoals = EasyIn.getInt();
			totalPoints = currentPoints + (currentGoals*3);
			footballer1.setTotal(currentPoints, currentGoals, noOfElements);
			place = footballer1.setEntry(totalPoints, noOfElements);
			footballer1.setName(currentName, place);
			footballer1.setPoints(currentPoints, place);
			footballer1.setGoals(currentGoals, place);
			System.out.println(footballer1.toString(place));
		}
		for (int i = 1; i <= noOfElements; i++)
		{
			footballer1 = new gaa();
			System.out.println(footballer1.toString(i));
		}
			

	}

}
