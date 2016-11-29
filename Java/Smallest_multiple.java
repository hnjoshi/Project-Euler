/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * @author Hardik Joshi
 *
 */

public class Smallest_multiple
{

	public static void main(String[] args)
	{
		long Start,End;
		
		long upto = 20;
		long num = upto + 1;

		boolean found = false;
		int counter = 0;
		
		Start = System.nanoTime();
		while(!found)
		{
			for(int i=1; i <= upto; i++)
			{
				if(num % i != 0)
				{
					break;
				}
				else
				{
					counter++;
				}
			}
			
			if(counter == upto)
			{
				found = true;
				break;
			}
			
			counter = 0;
			num++;
		}
		End = System.nanoTime();
		
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to " + upto + " is " + num);
		System.out.println("\n" + (End-Start)/1000 + " milliseconds");
	}

}
