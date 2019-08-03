# sequencePrinting
This is the program that prints the sequence as shown in the below diagram
1  2  3  4
12 13 14 5
11 16 15 6
10 9  8  7

Since the output screen is not a flexible in printing this in order i have created this matrix called mat and printed that matrix to output screen.
few changes can print the same pattern to any size of matrix.

here operation is dived into 4 parts
that are
here we consider matrix in the form mat[i][j]
North : j is const and i will decrement
East : i is const and j will increment
South : j is const and i will increment
West : i is const and j will decrement

there is bounds the will give staring and ending of matrix at any point as they are global var, and once the row/column is assigned then bound will increase/decrease to eliminate the row/column from getting reassigned again.
