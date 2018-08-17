
public class arrayEntry 
{

	public static void main(String[] args) 
	{
		int howMany;
		String[] namesArray;
		String currentName;
		int step;
		int place;
		int noOfElements;
		noOfElements = 0;
		place = 0;
		step = 0;
		System.out.println("How many names would you like in your Array?");
		howMany = EasyIn.getInt();
		namesArray = new String[howMany];
		
		for (int i = 0; i < howMany; i++) //loops for the length of the array
		{
			System.out.println("Please Enter a name");
			currentName = EasyIn.getString();
			if (noOfElements == 0)    // 1st entry can only go in one place
			{
				namesArray[i] = currentName;
				noOfElements++;
			}
			else // the start of the rest of the array
			{
				step = 0 ;
				while ((step < noOfElements) && (currentName.compareTo(namesArray[step]) > 0)) //Stops once it finds the right position, the for loop kept on going past where it needed to stop
					{
						step ++;
					}
				place = step ;  // saves the position where current name goes
				for(int k = noOfElements; k > place; k--)					
				{
					namesArray[k] = namesArray[k-1];	// pushes everything from namesArray[place]	back 1 position to make room for currentName
				}
				namesArray[place] = currentName;	// slots in currentName into the correct position						
				noOfElements++;
			}	
		}
		System.out.println("\n\n\tYour list of names arranged alphabetically: ");
		
		for(int l=0; l < namesArray.length; l++)
			{
				System.out.println("\t" + namesArray[l]); // prints out array in alphabetical order 
			}
		
	}

}
