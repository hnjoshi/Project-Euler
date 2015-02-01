/**
 * 
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

    3
   7 4
  2 4 6
 8 5 9 3

 That is, 3 + 7 + 4 + 9 = 23.

 Find the maximum total from top to bottom of the triangle below:

                   75
                 95 64
                17 47 82
               18 35 87 10
              20 04 82 47 65
             19 01 23 75 03 34
            88 02 77 73 07 63 67
           99 65 04 28 06 16 70 92
         41 41 26 56 83 40 80 70 33
        41 48 72 33 47 32 37 16 94 29
       53 71 44 65 25 43 91 52 97 51 14
     70 11 33 28 77 73 17 78 39 68 17 57
    91 71 52 38 17 14 91 43 58 50 27 29 48
   63 66 04 68 89 53 67 30 73 16 69 87 40 31
  04 62 98 27 23 09 70 98 73 93 38 53 60 04 23

  
 * @author Hardik Joshi
 *
 */


public class Maximum_path_sum_I
{

	public static void main(String[] args)
	{
		String nums = "75 95 64 17 47 82 18 35 87 10 20 04 82 47 65 19 01 23 75 03 34 88 02 77 73 07 63 67 99 65 04 28 06 16 70 92 41 41 26 56 83 40 80 70 33 41 48 72 33 47 32 37 16 94 29 53 71 44 65 25 43 91 52 97 51 14 70 11 33 28 77 73 17 78 39 68 17 57 91 71 52 38 17 14 91 43 58 50 27 29 48 63 66 04 68 89 53 67 30 73 16 69 87 40 31 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

		int grid[][] = new int[15][15];
		
		int i=0;
		for(int r=0; r < 15; r++)
		{
			for(int c=0; c < 15; c++)
			{
				if(c < r+1)
				{
					grid[r][c] = Integer.parseInt(nums.substring(i, i+2));
					i += 3;
				}
				else
				{
					grid[r][c] = 0;
				}
			}
		}
		
		printArray2(grid);
		
		for(int l = (15 - 2); l >= 0; l--)
		{
			for(int m = 0; m <= l; m++)
			{
				grid[l][m] += Math.max(grid[l+1][m], grid[l+1][m+1]);
			}
		}
		
		System.out.println("\nThe maximum total from top to bottom of the triangle is " + grid[0][0]);
	}
	
	public static void printArray2(int x[][])
	{		
		String max = "  ";
		
		for(int i=0;i<15;i++)
		{
			for(int l=0;l<15;l++)
			{
				String num = x[i][l] + "";
				
				if(num.length() == max.length())
				{
					System.out.print(x[i][l]+"  ");
				}
				else
				{
					
					String temp = "";
					for(int j=0; j < max.length()-num.length(); j++)
					{
						temp += "0";
					}
					
					System.out.print(temp + x[i][l]+"  ");
				}
			}
			
			System.out.println(""); 
		}
	}

}
