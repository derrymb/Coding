import java.util.ArrayList;
public class currentTimeMillis {
	
		public static void main(String[] args)
		{
			long start = System.currentTimeMillis();
			System.out.println( start );
			long start1 = System.nanoTime();
			System.out.println( start1 );
			//System.out.println("The time it took to print :" + ( (double)(start1/1000000000)-(double)(start/1000) ) );
			
			int i;
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(i = 0;i <= 10000000;i++)
				{
					a.add(i);
				}
			long end1 = System.nanoTime();
			long end = System.currentTimeMillis();
			
			System.out.println();
			System.out.println("Unprocessed time from Nano : " + (end1 - start1) );
			System.out.println("Unproccesed time from Millis : " + (end - start) );
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println();
			System.out.println("Time from Nano : " + ( ((double)(end1 - start1)/1000000000) ) );
			System.out.println("Time from Millis : " + ( ((double)(end - start)/1000) ) );
			System.out.println();
		}
	}


