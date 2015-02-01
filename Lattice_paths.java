

/**
 * 
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, 
 * there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20 x 20 grid?
 * 
 * (x+y)!/(x! * y!) possible lattice paths (As per online research)
 * 
 * @author Hardik Joshi
 *
 */


public class Lattice_paths
{

	public static void main(String[] args)
	{
		final int gridSize = 20;
		long paths = 1;
		 
		for (int i = 0; i < gridSize; i++) {
		    paths *= (2 * gridSize) - i;
		    paths /= i + 1;
		}
		
		System.out.println("Possible paths for " + gridSize + "x" + gridSize + " grid are " + paths);

	}
}

/*	
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
	
	public static long factorial(int n)
	{
		long f = 1;
		
		for(int i=1; i<=n; i++)
		{
			f *= i;
		}
		
		return f;
	}
*/


/*
 * 
 * String x = "20";
		String y = "20";
		String XplusY = Integer.parseInt(x) + Integer.parseInt(y) + "";
		
		BigInteger XplusYfact = factorial2(new BigInteger(XplusY));
		BigInteger Xfact = factorial2(new BigInteger(x));
		BigInteger Yfact = factorial2(new BigInteger(y));
		
		BigInteger answer = XplusYfact.divide(Xfact.add(Yfact));
		
		System.out.println("Possible paths for " + x + "x" + y + " grid is " + answer);
 */