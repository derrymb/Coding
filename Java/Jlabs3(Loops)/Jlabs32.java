class Jlabs32

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				10/10/2017
// Purpose : 			find the sum of a collection of data values. Your program should terminate when a zero value is read.



{
    public static void main(String[] args)
    {
    	int range[];
    	range = new int [10];
    	int sum;
    	sum = 0;
    	
    	range[0] = 88;
    	range[1] = 55;
    	range[2] = 22;
    	range[3] = 99;
    	range[4] = 66;
    	range[5] = 34;
    	range[6] = 45;
    	range[7] = 35;
    	range[8] = 7;
    	range[9] = 0;
    	
    	
    	
    	for(int i : range)
    	sum += i;
    	
    	System.out.println("The sum of the array before it hit a zero is " + sum);

    	
    	//	{
    	//		if (i == 0)
    	//		System.out.println("The sum of the array before it hit a zero is " + sum);
    	//		else
    	//		System.out.println("The sum of the array before it hit a zero is " + sum);
    	//	}
    }
}
