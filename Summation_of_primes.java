/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

	Find the sum of all the primes below two million.

 * @author Hardik Joshi
 *
 */


public class Summation_of_primes
{

	public static void main(String[] args)
	{
		//int primeLessThan = 10;
		long primeLessThan = 2000000;
		long primeTotal = 0;
		
		long number = 2;
		while(number < primeLessThan)
		{
         if(isPrime(number))
         {
         	//System.out.println(number);	//print prime numbers only
         	primeTotal += number;
         	//System.out.println(primeTotal);
         }
         number++;
		}
		
		System.out.println("The sum of all the primes below " + primeLessThan + " is " + primeTotal);

	}
	
	public static boolean isPrime(long number)
	{
		for(long i=2; i<number; i++)
		{
			if(number % i == 0)
			{
				return false; //number is divisible so its not prime
         }
      }
      return true; //number is prime now
	}

}
