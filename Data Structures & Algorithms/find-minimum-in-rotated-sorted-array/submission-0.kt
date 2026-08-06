/*
0 1 2 3 4 5 6
6 0 1 2 3 4 5
5 6 0 1 2 3 4
4 5 6 0 1 2 3
3 4 5 6 0 1 2
2 3 4 5 6 0 1
1 2 3 4 5 6 0


6 0 1 2 3 4 5


*/



class Solution {
    fun findMin(nums: IntArray): Int {

        var left = 0
        var right = nums.lastIndex

        while (left < right) {
            val mid = left + (right - left) / 2

            if (nums[mid] <= nums[right]) {
                right = mid
            }
            else {
                left = mid + 1
            }
        }
        return nums[left]

    }
}
