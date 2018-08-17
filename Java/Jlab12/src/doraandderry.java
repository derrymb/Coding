
public class doraandderry 
{

	public static int addAna(String[] theArray, int noOfElements)
	{
		theArray[2] = "Ana";
		noOfElements++;
		return noOfElements;
	}
	public static void main(String[] args) 
	{
		String[] ourArray;
		ourArray = new String[3];
		int howMany = 2;
		
		ourArray[0] = "dora";
		ourArray[1] = "derry";
		
		howMany = addAna(ourArray, howMany);
		
		for (int i = 0; i < howMany; i++)
		{
			System.out.println(ourArray[i]);
		}
	}

}
