public class employeeUse 
{

	public static void main(String[] args) 
	{
		employee employee1; // housing list
		String currentName;
		String currentId;
		int currentAge;

		employee1 = new employee(); // move into house
		System.out.print("Enter name ");
		currentName = EasyIn.getString();
		System.out.print("Enter Id ");
		currentId = EasyIn.getString();
		System.out.print("Enter age ");
		currentAge = EasyIn.getInt();
		employee1.setName(currentName);
		employee1.setId(currentId);
		employee1.setAge(currentAge);
		System.out.println(employee1.toString());


	}

}
