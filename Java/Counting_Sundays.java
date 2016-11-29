import java.util.Calendar;

/**
 * 
 * You are given the following information, but you may prefer to do some research for yourself.
  
	•	1 Jan 1900 was a Monday.
	•	Thirty days has September,
 	 	April, June and November.
 	 	All the rest have thirty-one,
 	 	Saving February alone,
 	 	Which has twenty-eight, rain or shine.
 	 	And on leap years, twenty-nine.
	•	A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

 *	How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 * 
 * @author Hardik Joshi
 *
 */

public class Counting_Sundays
{

	public static void main(String[] args)
	{
		Calendar calendar = Calendar.getInstance();
		int count = 0;
		for(int year=1901; year<=2000; year++)
		{
		   for(int month=0; month < 12; month++)
		   {
		   	calendar.set(year, month, 1);
		      
		      if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
		      {
		      	count++;
		      }
		   }
		}
		
		System.out.println( count + " Sundays fell on the first of the month during the twentieth century.");

	}

}
