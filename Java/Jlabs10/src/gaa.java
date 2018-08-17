
public class gaa {
	String[] names;
	int[] pointsScored;
	int[] goalsScored;
	int[] totalPoints;
	int currentTotal;
	
	
	
	
	 
		
		public gaa()
			{
				names = new String[40];
				pointsScored = new int[40];
				goalsScored = new int [40];
				totalPoints = new int[40];
				
			}
		
		public void setTotal(int pointsScored, int goalsScored, int noOfElements)
			{
				int step;
				step = 0 ;
				if (noOfElements == 0)
				{
					totalPoints[0] = pointsScored + (goalsScored * 3);
				}
				else
				{
					currentTotal = pointsScored + (goalsScored * 3);
					while(step < noOfElements)
					{
						if (currentTotal - totalPoints[step] > 0)
						{
							for(int i = noOfElements-1; i > step; i--)
							{
								totalPoints[noOfElements] = totalPoints[noOfElements-1];
							}
							totalPoints[step] = currentTotal;
						}
					step++;
					}
					
				}
			}
		public int setEntry(int theTotal, int noOfElements)
			{
				int place;
				place = 0;
				if (noOfElements == 1)
				{
					return place;
				}
				else 
				{
					int i = 0;
					while(i < noOfElements && theTotal < totalPoints[i])
					{
						if (theTotal > totalPoints[i])
						{
							place = i;
						}
						i++;
					}
					return place;
				}
			}
		public void setName(String theName, int place)
			{
					names[place] = theName;
			}
		public void setPoints(int thePoints, int place)
			{
				pointsScored[place] = thePoints;
			}
		public void setGoals(int theGoals, int place)
			{
					goalsScored[place] = theGoals;
			}
		
		
		
		public String getName (int position)
		
			{
				return names[position];
			}
		
		public int getPoints (int position)
		
			{
				return pointsScored[position];
			}
		
		public int getGoals (int position)
		
			{
				return goalsScored[position];
			}
		public int getTotal (int position)
		
			{
				return totalPoints[position];
			}
		
		
		public String toString (int position)
		
			{
				String myString;
				
				myString = "";
				myString += "\n Name : " + names[position];
				myString += "\n Points   : " + pointsScored[position];
				myString += "\n Goals  : " + goalsScored[position];
				myString += "\n Total Score  : " + totalPoints[position];
				
				return myString;
			}

}
