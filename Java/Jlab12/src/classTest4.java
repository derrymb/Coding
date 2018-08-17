
public class classTest4 
{

	public static void main(String[] args) 
	{
		String[] myArray;
		myArray = new String[4];
		
		
		for (int i = 0; i < 4; i++)
		{
			System.out.println("Please enter a name");
			myArray[i] = EasyIn.getString();
		}
		for (int i = 0; i < 4; i++)
		{
			System.out.println(myArray[i]);
		}

		outSideMeth.makeChange(myArray);
		
		for (int i = 0; i < 4; i++)
		{
			System.out.println(myArray[i]);
		}
	}

}
