public class Jlabs71

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				17/11/2017
// Purpose : 			Write a program that reads in an array of integers and then displays the number of odd and even
//						numbers in the array. Use a method you have written already isEven()on each array element. 



{
    public static boolean isEven(int numbers)
    {
    	// tru;
    	//String fal;
    	boolean isEv;
    	//tru = "True";
    	//fal = "False";
    	isEv = false;
    	
    	if (numbers % 2 == 0)
    		{
    			isEv = true;
    		}
    	return isEv;
    }
    public static void main(String[] args)
	{
	    
	    int[] array ;
	    int length ;
	    int index ;
	    int odd ;
	    int even ;
	    int input ;
	    
	    even = 0 ;
	    odd = 0 ;
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

