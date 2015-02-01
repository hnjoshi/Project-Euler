import java.math.BigInteger;

/**
 * 
 * n! means n × (n - 1) × ... × 3 × 2 × 1
 * 
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the
 * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 * 
 * 
 * @author Hardik Joshi
 * 
 */

public class Factorial_digit_sum
{

	public static void main(String[] args)
	{
		BigInteger n = new BigInteger("100");
		
		String digits = factorial2(n) + "";
		
		int digitSum = 0;
		for(int i=0; i < digits.length(); i++ )
		{
			digitSum += Integer.parseInt(digits.substring(i, i+1));
		}
		
		System.out.println(digitSum);
	}
	
	public static BigInteger factorial2(BigInteger n) 
	{
	    BigInteger result = BigInteger.ONE;

	    while (!n.equals(BigInteger.ZERO)) 
	    {
	        result = result.multiply(n);
	        n = n.subtract(BigInteger.ONE);
	    }

	    return result;
	}

}
