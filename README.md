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


Problem 2
Given an array of integers, you need to rearrange it such that all zeroes are shifted to the end of the array. The relative order of the non-zero elements must remain unchanged. This operation must be performed in-place, without creating a new copy of the array.	

Approach:
* Maintain two pointers(left and right)
* left pointer indicates the index where the next non-zero element should be inserted
* right pointer used to traverse each element in the array.
* For every right index, if the element at right is non-zero, then swap it with the element at the left index, Increment the left pointer
* by the timethe loop ends, all zeros will be shifted to the right side of the array.
