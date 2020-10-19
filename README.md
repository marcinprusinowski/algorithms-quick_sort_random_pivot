# Quick Sort Random Pivot!


In QuickSort we first partition the array in place such that all elements to the left of the pivot element are smaller, while all elements to the right of the pivot are greater that the pivot. Then we recursively call the same procedure for left and right subarrays. Here we take the pivot randomly.
The reason to use random pivoting is that of not allowing adversary to make your algorithm hit worst case time. In other words with random pivoting your algorithm expected performance equally good on all datasets. But is is more propabilicity way of thinking about this problem. Even with random choice we can still get the worst possible case when we have ti hit n times n - 1 size array. So in ma opinion O(n*n) is still possible but with lesser probability.
# Conclusion
Quick Sort is recursive algorithm.
Quick Sort is in-place sorting algorithm because it uses extra space only for storing recursively calls but not manipulating input.
Time complexity:
-Best case and average O(n log n), because we always divide array to possible the most equal 	sub-arrays.
-Worst case O(n*n)  when we get the most unbalanced sub-arrays, pivot is the smallest or largest element. That means we always get n-1 size of array, and we do It n times.
Feel free to download the code and try, but I suggest you to implement it by yourself first.
