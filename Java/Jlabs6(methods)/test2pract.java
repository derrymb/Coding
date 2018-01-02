public class test2pract

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				17/11/2017
// Purpose : 			Write a programme that asks the user to enter a group of people and thier ages and supplys the oldest name and age.



{
    public static void main(String[] args)
	{
	    String currentName ;
	    int currentAge ;
	    String oldestName ;
	    int oldestAge ;
	    int length ;
	    int index ;
	    
	   
	  
	    System.out.println("Please enter the desired number of names to enter") ;
	    length = EasyIn.getInt();
	   	System.out.println("Please enter the name of the 1st person") ;
	    currentName = EasyIn.getString();
	    System.out.println("Please enter " + currentName + "'s age") ;
	    currentAge = EasyIn.getInt();
	    oldestName = currentName ;
	    oldestAge = currentAge ;
	    for (index = 0; index < length-1; index++)
	    	{
	    		System.out.println("Please enter the name of the next person") ;
	    		currentName = EasyIn.getString();
	    		System.out.println("Please enter " + currentName + "'s age") ;
	    		currentAge = EasyIn.getInt();
	    		if (currentAge > oldestAge)
	    			{
	    				oldestName = currentName ;
	    				oldestAge = currentAge ;
	    			}
	    	}
	    
	    System.out.println(oldestName + " was the oldest person you entered with an age of " + oldestAge);
	}    
    
}

