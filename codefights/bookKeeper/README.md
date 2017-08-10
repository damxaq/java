The quirky book store owner that you work for likes her books sorted in a particular order, and it's your job to sort the books to her liking. All the books in the store are stuffed into a single bookcase with several shelves. Here's what the owner wants you to do:

First, you're supposed to sort all the books alphabetically. It's not that simple though - you should ignore all instances of the words of, a, the, and and in the title. It is guaranteed that the name of the book can't end with these words.

Secondly, you should put the books back into the bookcase so that:

The books are sorted column by column (row by row would be too simple!);
Each shelf has the same number of books it used to have.
What are you waiting for? Get it done already!

Example

For

books = 
[["Of Mice and Men",                      "The Hunger Games","The Grapes of Wrath"], 
 ["Black Beauty",                         "The Book Thief"], 
 ["Harry Potter and the Sorcerer's Stone","Divergent",       "Java For Dummies"]]
the output should be

BookKeeper(books) =
[["Black Beauty",   "The Grapes of Wrath",                   "Java For Dummies"], 
 ["The Book Thief", "Harry Potter and the Sorcerer's Stone"], 
 ["Divergent",      "The Hunger Games",                      "Of Mice and Men" ]]
Input/Output

[time limit] 3000ms (java)
[input] array.array.string books

The scrambled bookcase, shelf by shelf. It is guaranteed that the name of each book consists only of English letters and punctuation marks. It is also guaranteed that the words of, and, a and the are never the last ones in a book's title.

Constraints:
1 ≤ books.length ≤ 35,
0 ≤ books[i].length ≤ 35,
1 ≤ books[i][j].length ≤ 40.

[output] array.array.string

The sorted bookcase.
