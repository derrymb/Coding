class Jlabs64test
// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				17/11/2017
// Purpose : 			Write a method called isEven() that takes an integer as its argument and returns 
//						true if the argument is an even number otherwise it returns false. 

{


public static void main(String[] args)

    {	
	
	int mark;

   	System.out.println ("Please enter your college mark");
   	
   	mark = EasyIn.getInt();
   	
   	System.out.println ("Your Mark is " + mark);

    System.out.println ("Your Mark is enough to earn you a: " + Jlabs64.award(mark) + " Award.");

  }

}