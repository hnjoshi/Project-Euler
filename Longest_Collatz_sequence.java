/**
 * The following iterative sequence is defined for the set of positive integers:

	n --> n/2 (n is even)
	n --> 3n + 1 (n is odd)

	Using the rule above and starting with 13, we generate the following sequence:

	13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

	It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

	Which starting number, under one million, produces the longest chain?

	NOTE: Once the chain starts the terms are allowed to go above one million.

 * 
 * @author Hardik Joshi
 *
 */

public class Longest_Collatz_sequence
{

	public static void main(String[] args)
	{
		long num = 0;
		long terms = 0;
		long highestTermNum = 0;
		long highestTerm = 0;
		
		for(long i=1; i < 1000000; i++)
		{
			num = i;
			while(num != 1)
			{
				terms++;
				//System.out.print(num + " -> ");
				
				if(num % 2 == 0)
				{
					num = num/2;
				}
				else
				{
					num = 3*num + 1;
				}
				
			}
			
			terms++;
			//System.out.println(num);
			
			//System.out.println("Total terms = " + terms);
			
			if(terms > highestTerm)
			{
				highestTerm = terms;
				highestTermNum = i;
			}
			
			terms = 0;
		}
		
		System.out.println("\nThe Starting number " + highestTermNum + 
				" produces the longest chain of " + highestTerm + " terms");

	}

}
