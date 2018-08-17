public class stringConcatenationMethod
{
	public static String concat(String wordOne, String wordTwo)
	{
		String newWord;
		
		newWord = wordOne + " " + wordTwo;
		
		return newWord;
	}
	public static void main(String[] args) 
	{
		String first;
		String second;
		String returnValue;
		
		System.out.println("Please enter your 1st word");
		first = EasyIn.getString();
		System.out.println("Please enter your 2nd word");
		second = EasyIn.getString();
		
		returnValue = concat(first, second);
		
		System.out.println("Your two words stuck together are " + returnValue);
		
	}

}
