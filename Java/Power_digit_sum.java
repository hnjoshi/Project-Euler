import java.math.BigInteger;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 *
 * @author Hardik Joshi
 * 
 */

public class Power_digit_sum
{

	public static void main(String[] args)
	{
		BigInteger num = new BigInteger("2");
		
		num = num.pow(1000);
		
		String x = num + "";
		int sum = 0;
		for(int i=0; i < x.length(); i++)
		{
			//System.out.println(x.substring(i, i+1));
			sum += Integer.parseInt(x.substring(i, i+1));
		}
		
		System.out.println("The sum of the digits of the number 2^1000 is " + sum);
	}

}
