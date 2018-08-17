
public class anastest 
{
	public static void main(String[] args)
    {
    	String[] names;
    	int index;
    	int pos;
    	pos =-1;
    	int i;
    	String myString;
    	myString="";
    	
    	names=new String[4];
    	
    	for(index=0; index<names.length; index++)
    		{
	    			System.out.println("Enter a name ") ;
	    			names[index] = EasyIn.getString();	
	    				
	    	    for(i=0; i<names[index].length(); i++)
	    		{
	    			if(names[index].charAt(0)==names[index].charAt(1))
	    			 	{
	    			 		myString = names[index];
	    			 		pos = index;
	    			 	}	
	    		
	    		}
    	   }
    	if(pos==-1)
    	{
    	 System.out.println(" there is now word with 1st and 2nd char the same ");
    	}
    	else
    	{
    	 System.out.println(" the word is " + myString + " at pos "+ pos) ;	
    	}
    

	}

}
