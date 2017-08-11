Given an integer num, write an algorithm that determines if the given number has consecutive 1s in its binary representation.

Example

For num = 3, the output should be
consecutiveBit(num) = true.

310 is 112, which contains a pair of consecutive 1s.

For num = 21, the output should be
consecutiveBit(num) = false.

2110 is 101012, which contains no consecutive 1s.

Input/Output

[time limit] 3000ms (java)
[input] integer num

Constraints:
0 ≤ num < 231.

[output] boolean

Return true if the boolean representation of num contains consecutive 1s, otherwise return false.
