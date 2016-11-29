/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *	
 *	What is the 10 001st prime number?
 *
 * @author Hardik Joshi
 *
 */

public class X_10001st_prime
{

	public static void main(String[] args)
	{
		int X_th_Num = 10001;
		long X_th_Prime = 0;
		int counter = 0;
		
		int number = 2;
		while(counter < X_th_Num)
		{
         if(isPrime(number))
         {
         	//System.out.println(number);	//print prime numbers only
         	X_th_Prime = number;
         	counter++;
         }
         number++;
		}
		
		System.out.println("The " + X_th_Num + "th prime number is " + X_th_Prime);
	}
	
	public static boolean isPrime(int number)
	{
		for(int i=2; i<number; i++)
		{
			if(number % i == 0)
			{
				return false; //number is divisible so its not prime
         }
      }
      return true; //number is prime now
	}
}
