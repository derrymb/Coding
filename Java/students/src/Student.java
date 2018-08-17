class Student
{
	private String theID;			
	private String theName;
	private int theAvgMark;
	
	public Student()
	{
		
	}
	public Student(String Id, String Name, int AvgMark)
	{
		theID = Id;			
		theName = Name;
		theAvgMark = AvgMark;
	}
	public void setTheId(String studentId)
	{
		theID = studentId;
	}
	public void setTheName(String name)
	{
		theName = name;
	}
	public void setTheAvgMark(int avgMark)
	{
		theAvgMark = avgMark;
	}
	public String getTheID()
	{
		return theID;
	}
	public String getTheName()
	{
		return theName;
	}
	public int getTheAvgMark()
	{
		return theAvgMark;
	}
	public String outPrint()
	{
		String toPrint;
		
		
		toPrint ="";
		toPrint += "\n Name: " + theName;
		toPrint += "\n ID: " + theID;
		toPrint += "\n Average Mark: " + theAvgMark;
		
		return toPrint;
	}
	
}
