
public class doraandderry 
{

	public static int addAna(String[] theArray, int noOfElements)
	{
		theArray[2] = "Ana";					// because the memory is already assigned to 3!, in the method we use the 	
		noOfElements++;							// the array that is in the main program, and making a change in THAT MEMORY ADDRESS
		return noOfElements;					// , returning the no of elements, will display the array with the change already made
	}											// in the method
	public static void main(String[] args) 
	{
		String[] ourArray;
		ourArray = new String[3];	//length of the array to leave room for Ana
		int howMany = 2;			// no of elements
		
		ourArray[0] = "dora";
		ourArray[1] = "derry";
		
		howMany = addAna(ourArray, howMany);
		
		for (int i = 0; i < howMany; i++)
		{
			System.out.println(ourArray[i]);
		}
	}

}
