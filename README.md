# TwonumberSum
  Write a function that take in a non-empty array of distinct integers and an integer representing a target sum
if any two numbers in the input array sum up to  the target sum then it should be return them in an array.
assume that as most one pair solution.
input : [ 3, 4,5,6,-1,1,8,11,-5 ], 0
output : [-1,1]


# solution 
	# solution 1
- brutal force solution : using nested loop to iterate each element in array then check if their sum match with target.
- Time complexity: O(N^2) since it is using nested loop.
- space: O(1) since it access and remember each index at one.
	# solution 2
- improve solution: Using Hashtable will help to optimise the time complexity
- iterate array at one by looping
- at each index figure out potentalMatch for each num = target - currentnum
- we should considering if potentalMatch weather it content in Hashtable.
				- if yes return result
				- if not save the current num in HashTable for using it later
- Time Complexity : O(N)
- space/ memory : O(N)
	# solution 3
- by sort the given input , now we will have the sorted array 
- iterate from begin assign as left and ending assign as right the array 
- begin the loop until end or left match right
- sum it up compare to the target, if it match return result.
- if the sum is less than target , increate the index of left;
- if the sum is greater than target, decrete the index of right;
- end loop
- if exit loop and no result should return empty array.
- Time Complexity : sort assume that using binary sort O(NLogN) for this loop also at O(N)
- space : using left and right pointer is O(1)
