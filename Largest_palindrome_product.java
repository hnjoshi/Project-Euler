/**
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *	Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author Hardik Joshi
 *
 */


public class Largest_palindrome_product
{

	public static void main(String[] args)
	{
		int num1Smallest = 100;
		int num2Smallest = 100;
		
		int num1Largest = 999;
		int num2Largest = 999;

		long largestPalindrome = 0;
		
		String multiple = "";
		String sub1 = "";
		String sub2 = "";
		
		for(int i=num1Largest; i > num1Smallest; i--)
		{
			for(int j=num2Largest; j > num2Smallest; j--)
			{
				//multiple = 9009 + "";
				multiple = (i*j) + "";

				sub1 = multiple.substring(0, multiple.length()/2);
				//System.out.println(sub1);
				sub2 = new StringBuilder(multiple.substring(multiple.length()/2, multiple.length())).reverse().toString();
				//System.out.println(sub2);
				
				if( sub1.equals(sub2) )
				{
					if(largestPalindrome < Long.parseLong(multiple))
					{
						largestPalindrome = Long.parseLong(multiple);
					}
					break;
				}
			}
		}
		
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is " + largestPalindrome);

	}

}
