class Jlabs33class

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				18/10/2017
// Purpose : 			Write a program to read a list of integer values which will find and display the index
//					 	of the first occurrence and the last occurrence of the number 12. Your program should print 
//						the Index values of 0 (zero) if the number 12 is not found. The index is the sequence number
// 						of the data item 12. For example if the 8th data item is the only 12, the index value 8 should 
//						be displayed for the first and last occurrence.



{
    public static void main(String[] args)
    {
    	int number;
    	int firstOccurance;
    	int lastOccurance;
    	int index;
    	
    	lastOccurance = 0;
    	firstOccurance = 0;
    	index = 0;
    	
    	
    	System.out.println("Please type in a number between 1 and 15 or type 0 to stop the loop: ");
		number = EasyIn.getInt();
		
		while (number != 0)
		{
			index ++ ;
			if (num == 12)
			{
				firstOccurance = index;
			}
			
				if (firstOccurance > 0)
				{
					lastOccurance = index;
				}
			 
			System.out.println("Please type in a number between 1 and 15 or type 0 to stop the loop: ");
			number = EasyIn.getInt();
		}
		
		if (firstOccurance == 0)
		{
			System.out.println("No 12's were found, index number of 12's is :" + firstOccurance);
		}
		else
			

    }
    
}