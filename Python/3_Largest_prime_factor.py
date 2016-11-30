#!/usr/bin/python2.7 -tt
"""
Largest prime factor

Problem 3
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
"""

import pudb; pu.db

def largest_prime(n):
  l_prime = 2
  while l_prime < n:
    if n % l_prime == 0:
      n = n / l_prime
    l_prime += 1
  return l_prime

def main():
  print largest_prime(600851475143)

if __name__ == '__main__':
  main()