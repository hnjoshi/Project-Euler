/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
 * how many letters would be used? 
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) 
 * contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
 * The use of "and" when writing out numbers is in compliance with British usage.
 * 
 * @author Hardik Joshi
 *
 */

public class Number_letter_counts
{

	public static void main(String[] args)
	{
		int nums = 1000;
		long characters = 0;
		
		for(int i=1; i <= nums; i++)
		{	
			String current = i + "";
			
			if(current.length() == 4 && current.substring(1, 4).equals("000"))
			{
				String part1 = getWord(Integer.parseInt(current.substring(0, 1)));
				String part2 = "thousand";
				
				characters += part1.length() + part2.length();
				
				System.out.println(part1 + " " + part2);
			}
			else if(i > 99 && i < 1000 && current.substring(1, 3).equals("00"))
			{
				String part1 = getWord(Integer.parseInt(current.substring(0, 1)));
				String part2 = "hundred";
				
				characters += part1.length();
				characters += part2.length();
				
				System.out.println(part1 + " " + part2);
			}
			else if(i > 99 && i < 1000 && current.substring(1, 2).equals("0"))
			{
				String part1 = getWord(Integer.parseInt(current.substring(0, 1)));
				String part2 = "hundred";
				String part3 = "and";
				String part4 = getWord(Integer.parseInt(current.substring(2, 3)));
				
				characters += part1.length() + part2.length() + part3.length() + part4.length();
				
				System.out.println(part1 + " " + part2 + " " + part3 + " " + part4);
			}
			else if(i > 99 && i < 1000 && Integer.parseInt(current.substring(1, 3)) < 20)
			{
				String part1 = getWord(Integer.parseInt(current.substring(0, 1)));
				String part2 = "hundred";
				String part3 = "and";
				String part4 = getWord(Integer.parseInt(current.substring(1, 3)));
				
				characters += part1.length() + part2.length() + part3.length() + part4.length();
				
				System.out.println(part1 + " " + part2 + " " + part3 + " " + part4);
			}
			else if(i > 99 && i < 1000 && !current.substring(1, 2).equals("0") && !current.substring(2, 3).equals("0"))
			{
				String part1 = getWord(Integer.parseInt(current.substring(0, 1)));
				String part2 = "hundred";
				String part3 = "and";
				String part4 = getWord(Integer.parseInt(current.substring(1, 2) + "0"));
				String part5 = getWord(Integer.parseInt(current.substring(2, 3)));
				
				characters += part1.length() + part2.length() + part3.length() + part4.length() + part5.length();
				
				System.out.println(part1 + " " + part2 + " " + part3 + " " + part4 + "-" + part5);
			}
			else if(current.length() == 3 && current.substring(2, 3).equals("0"))
			{
				String part1 = getWord(Integer.parseInt(current.substring(0, 1)));
				String part2 = "hundred";
				String part3 = "and";
				String part4 = getWord(Integer.parseInt(current.substring(1, 3)));
				
				characters += part1.length() + part2.length() + part3.length() + part4.length();
				
				System.out.println(part1 + " " + part2 + " " + part3 + " " + part4);	
			}
			else if(current.length() == 2 && current.substring(1, 2).equals("0"))
			{
				characters += getWord(i).length();
				System.out.println(getWord(i));
			}
			else if(i > 20 && i < 100)
			{
				characters += getWord(Integer.parseInt(current.substring(0, 1) + "0")).length();
				characters += getWord(Integer.parseInt(current.substring(1, 2))).length();
				String part1 = getWord(Integer.parseInt(current.substring(0, 1) + "0"));
				String part2 = getWord(Integer.parseInt(current.substring(1, 2)));
				System.out.println(part1 + "-" + part2);
			}
			else
			{
				characters += getWord(i).length();
				System.out.println(getWord(i));
			}
		}
		
		System.out.println("\nTotal characters from 1 to 1000 = " + characters);

	}
	
	public static String getWord(int num)
	{
		String word = "";
		
		switch (num)
		{
			case 1: word = "one";
				break;
			case 2: word = "two";
				break;
			case 3: word = "three";
				break;
			case 4: word = "four";
				break;
			case 5: word = "five";
				break;
			case 6: word = "six";
				break;
			case 7: word = "seven";
				break;
			case 8: word = "eight";
				break;
			case 9: word = "nine";
				break;
			case 10: word = "ten";
				break;
			case 11: word = "eleven";
				break;
			case 12: word = "twelve";
				break;
			case 13: word = "thirteen";
				break;
			case 14: word = "fourteen";
				break;
			case 15: word = "fifteen";
				break;
			case 16: word = "sixteen";
				break;
			case 17: word = "seventeen";
				break;
			case 18: word = "eighteen";
				break;
			case 19: word = "nineteen";
				break;
			case 20: word = "twenty";
				break;
			case 30: word = "thirty";
				break;
			case 40: word = "forty";
				break;
			case 50: word = "fifty";
				break;
			case 60: word = "sixty";
				break;
			case 70: word = "seventy";
				break;
			case 80: word = "eighty";
				break;
			case 90: word = "ninety";
				break;
		}
		
		return word;
	}

}
