class Addition  

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				04/10/2017
// Purpose : 			user enters 3 exam marks. Programming, Maths and Hardware. 
//						The program will then calculate their average mark and indicate whether the average mark is a :
//						Distinction	70 - 100
//						Merit1		63 - 69
//						Merit2		55 - 62
//						Pass		40 - 54
//						Fail		Less Than 40




 
{
    public static void main(String[] args)
	{

		int programming; 
	    int hardware;
	    int maths;
	    double avgMark; 
	    final int NUMBERSUBS;
	    
	    NUMBERSUBS = 3;
	    		
		System.out.print("Enter your programming mark ->  "); 
		programming = EasyIn.getInt();
		System.out.print("Enter your hardware mark ->  ");
		hardware = EasyIn.getInt(); 
		System.out.print("Enter your maths mark ->  ");
		maths = EasyIn.getInt();
		avgMark = (programming + hardware + maths) / NUMBERSUBS ; // Calculate average
		
			if (avgMark >= 70)
				{
					System.out.println("Congratulations you earned a Distinction with a Average mark of " + avgMark); 
				}
			else if (avgMark >= 63)
				{
					System.out.println("Congratulations you earned a Merit1 with a Average mark of " + avgMark);
				}
		  	else if (avgMark >= 55)
			  	{
			  		System.out.println("Well done you earned a Merit2 with a Average mark of " + avgMark);
			  	}
		  	else if (avgMark >= 40)
			  	{
			  		System.out.println("Needs improvement, you earned a Pass with a Average mark of " + avgMark);
			  	}
			else
				{
					System.out.println("Unfortunatly you earned a Failing grade with a Average mark of " + avgMark);
				}
	}
}
