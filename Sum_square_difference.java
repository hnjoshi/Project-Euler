/**
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * 
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and 
 * the square of the sum is 3025 - 385 = 2640.
 *	Find the difference between the sum of the squares of the first one hundred natural numbers 
 * and the square of the sum.
 *
 * @author Hardik Joshi
 *
 */
public class Sum_square_difference
{

	public static void main(String[] args)
	{
		int naturalNumUpto = 100;
		
		long sumOfSquare = 0;
		long squareOfSum = 0;
		
		long total = 0;
		for(int i=1; i <= naturalNumUpto; i++)
		{
			sumOfSquare += Math.pow(i, 2);
			total += i;
		}
		
		squareOfSum = (long) Math.pow(total, 2);
		
		System.out.println(squareOfSum - sumOfSquare);

	}

}
