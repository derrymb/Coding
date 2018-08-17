class StudentUse

{
	public static void main(String[] args)
	{
		Student student1;
		String studentId;
		String name;
		int avgMark;
		
		
		
		
		
		
		System.out.println("ENter your id: ");
		studentId = EasyIn.getString();
		System.out.println("ENter your name: ");
		name = EasyIn.getString();
		System.out.println("ENter your avgMark: ");
		avgMark = EasyIn.getInt();
		student1 = new Student(studentId, name, avgMark);
		System.out.println(student1.outPrint());
		
	}
	
}
