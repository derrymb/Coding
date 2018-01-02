class Jlabs2b4
// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				27/09/2017
// Purpose : 			Asks the user to enter 3 different numbers. The program then tells the user which number was the lowest number entered. 
{
	public static void main (String args[]) 
	{
	
        int numberOfNumbers, temp;
        
        System.out.print("Please press 3");
        numberofNumbers = EasyIn.getInt() ;
        
        int a[] = new int[numberofNumbers];
        System.out.println("Please enter 3 integer numbers");
        
        
        for (int i = 0; i < numberofNumbers; i++) 
        {
            a[i] = EasyIn.getInt() ;
        }
        for (int i = 0; i < numberofNumbers; i++) 
        {
            for (int j = i + 1; j < numberofNumbers; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < numberofNumbers - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[numberofNumbers - 1]);
    }
}