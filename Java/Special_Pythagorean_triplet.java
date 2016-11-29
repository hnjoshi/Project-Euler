/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

	a^2 + b^2 = c^2

	For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.  Sum a+b+c = 3+4+5 = 12.  Product a*b*c = 3*4*5 = 60.

	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.

 * @author Hardik Joshi
 *
 */
public class Special_Pythagorean_triplet
{

	public static void main(String[] args)
	{
		long a,b,c;
		long sumABC = 1000;
		
		boolean found = false;
		
		for(int i=1; i<sumABC; i++)
		{
			for(int j=2; j<sumABC; j++)
			{
				a = (long) (Math.pow(j,2) - Math.pow(i, 2));
				
				if(a > 0)
				{
					b = 2 * i * j;
					
					c = (long) (Math.pow(j,2) + Math.pow(i, 2));
					
					if( (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) && (a+b+c) == sumABC )
					{
						System.out.println(a + " " + b + " " + c);
						System.out.println("The product of abc = " + (a*b*c));
						
						found = true;
					}
				}
				
				if(found)
				{
					break;
				}
				
			}
			
			if(found)
			{
				break;
			}
		}
		
	}

}
