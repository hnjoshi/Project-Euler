/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *	What is the largest prime factor of the number 600851475143 ?
 *
 * @author Hardik Joshi
 *
 */

public class Largest_prime_factor
{

	public static void main(String[] args)
	{
		long givenNum = 600851475143L;
		
		long num = givenNum;
		long i = 2;

		while (i < num)
		{
			if (num % i == 0)
			{
				num = num / i;
			}
			i++; 
		}
		
		System.out.println("The largest prime factor of the number "  + givenNum + " is " + i);
	}

}
