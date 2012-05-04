## Problem E: Jolly Jumpers

A sequence of _n > 0_ integers is called a _jolly jumper_ if the absolute
values of the difference between successive elements take on all the values 1
through _n-1_. For instance,

    
    
    1 4 2 3
    

is a jolly jumper, because the absolutes differences are 3, 2, and 1
respectively. The definition implies that any sequence of a single integer is
a jolly jumper. You are to write a program to determine whether or not each of
a number of sequences is a jolly jumper.

### Input

Each line of input contains an integer _n_ <= 3000 followed by _n_ integers
representing the sequence.

### Output

For each line of input, generate a line of output saying "Jolly" or "Not
jolly".

### Sample Input

    
    
    4 1 4 2 3
    5 1 4 2 -1 6
    

### Sample Output

    
    
    Jolly
    Not jolly
    

