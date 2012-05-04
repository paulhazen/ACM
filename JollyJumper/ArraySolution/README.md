## Array Solution

A "JollyJumper" will be a "JollyJumper" if given a N number of integers, the absolute difference between each adjacent pair of the integers will map to a location within an array of length N-1, if you subtract each absolute value by `1`

####Example

For example, the sequence:

    1 3 4 7 11

Would map to an array of length 4:

    abs(3-1) = 2  // Maps to index "1" in the array
    abs(4-3) = 1  // Maps to index "0" in the array
    abs(7-4) = 3  // Maps to index "2" in the array
    abs(11-7) = 4 // Maps to index "3" in the array

Taking the values returned from above, you can see it maps to an array like:

    [0, 1, 2, 3]

####Identifying Fail Cases

While parsing the numbers, a fail can be detected if there are two identical adjacent numbers
