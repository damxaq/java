You are in a field of tiles, m. Each tile may or may not have a sign on it.

There are 4 possible types of signs:

"S" is your starting point;
"F" is the finish;
"R" means that you have to turn 90 degrees clockwise;
"L" means that you have to turn 90 degrees counterclockwise.
Empty tiles are represented with the character "-".

Your starting direction is d.

The steps of the game are:

Start from the tile with the sign "S", pointing to the direction d;
Move forward until you reach a sign or the edge of the field;
If you reach a sign, do what it says depending on the sign;
If you reach the edge of the field, the game ends.
Your task is to return true if you have reached the finish sign at the end of the game, or false if you have not.

Example
For

m = ["S-R", 
     "F-R"]
and d = "R", the output should be
gameOfSigns(m, d) = true.

Here's how it works:
image

Input/Output

[time limit] 3000ms (java)
[input] array.string m

There will be only 1 "S" sign and 1 "F" sign in a field.
It is guaranteed that there won't be an infinite loop trap.

Guaranteed constraints:
0 < m.length ≤ 1000,
0 < m[i].length ≤ 1000,
m[i].length = m[j].length.

[input] string d

The direction in which you move at the start of the game. The options for d are the strings "U"(up), "D"(down), "R"(right), or "L"(left).

[output] boolean

Return true if you end up reaching the finish sign at the end of the game, otherwise return false.
