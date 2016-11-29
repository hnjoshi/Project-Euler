#!/usr/bin/python2.7 -tt

"""
Multiples of 3 and 5

Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
"""

import sys

def sum_of_multiples_of_3_or_5(max_num):
  # Get the list of multiples of 3 or 5 using List comprehension
  multiples_of_3_or_5 = [ num
                          for num in range(1,max_num)
                          if num%3 == 0 or num%5 == 0 ]

  sum = 0
  for num in multiples_of_3_or_5:
    sum += num

  return sum

# Gather our code in a main() function
def main():
  args = sys.argv[1:]

  if not args:
    print 'usage: [--max-num num]'
    print 'example: python 1_Multiples_of_3_and_5.py --max-num 1000'
    sys.exit(1)

  max_num = 0
  if args[0] == '--max-num':
    max_num = int(args[1])
    del args[0:2]

  if max_num:
    print sum_of_multiples_of_3_or_5(max_num)

# Standard boilerplate to call the main() function to begin the program.
if __name__ == '__main__':
  main()