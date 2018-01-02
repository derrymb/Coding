public class Jlabs72

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				17/11/2017
// Purpose : 			Write a program that reads in an array of integers and then tells you the highest and lowest numbers in the array



{
    public static void main(String[] args)
	{
	    
	    int[] array ;
	    int length ;
	    int index ;
	    int high ;
	    int low ;
	    int input ;
	    
	    high = 0 ;
	    low = 0 ;
	    System.out.println("Please enter the desired lenght of your array") ;
	    length = EasyIn.getInt();
	    array = new int [length] ;
	    for (index = 0; index < length; index++)
	    	{
	    		System.out.println("Please enter a number:") ;
	    		input = EasyIn.getInt() ;
	    		array[index]= input;
	    		if (isEven(array[index]) == true)
	    			{
	    				System.out.println("Number "+ array[index] + " is even") ;
	    				even++ ;
	    			}
	    		else
	    			{
	    				System.out.println("Number "+ array[index] + " is odd");
	    				odd++;
	    			}
	    	}
	    
	    System.out.println("Your array had " + even + " even numbers and " + odd + " odd numbers.");
	}    
    
}

