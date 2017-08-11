Fermat's factorization method is:
If a · b = n  (where a ≤ b), then there exist some c and d such that n = c2 - d2.
Your goal is to return for given n such c and d as an array.
Since we want c and d to be uniquely determined, in all test cases n is a semiprime number.

Example
For n = 15, the output should be
fermactor(n) = [4, 1].
15 = 42 - 12.

Input/Output

[time limit] 3000ms (java)
[input] integer n

A semiprime number.

Guaranteed constraints:
10 < n < 109.

[output] array.integer

c and d are guaranteed to be integers if the difference between a and b is even. For all test cases, this is true.
