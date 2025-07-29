# interview_assignment_NMAMIT_DhaneenShetty

This Repository contains the solution for 2 programming questions, each problem includes
* solution file
* test file with multiple test cases

Problem1
Given an array of integers, determine if any integer appears at least twice within the array.If such a duplicate exists, return true. If every element in the array is unique, return false.		
Approach:
          * convert the array into IntStream.
          * And then call the distinct function that stores only the distinct elememts(removes Duplicates) and then convert it back to array.
          * Compare the sizes of the original array and the new array.
          * if size of new array is not equal to original array then, return true
          * else return false.
