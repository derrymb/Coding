
public class employee {

	 // Employee
		private String name;
		private String employeeId; 
		private int age;

		public employee () // constructor
		
		{
			name = "";
			employeeId = "";
			age = 0;


		}
		
		// Mutators (Setter Methods)
		
		public void setName (String theName)
		
		{
			name = theName;
		}
		
		public void setId (String theId)
		
		{
			employeeId = theId;
		}
		
		public void setAge (int theAge)
		
		{
			age = theAge;
		}
		
		// Selectors (Getter Methods) no parameters 
		
		public String getName ()
		
		{
			return name;
		}
		
		public String getId ()
		
		{
			return employeeId;
		}
		
		public int getAge ()
		
		{
			return age;
		}

		
	 
	// Other Methods
		
		
	   	public String toString ()
		
		{
			String myString;
			
			myString = "";
			myString += "\n Name : " + name;
			myString += "\n ID   : " + employeeId;
			myString += "\n age  : " + age;
			
			return myString;
		}
	} //Employee



