class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val prefix = IntArray(n) {1}
        val suffix = IntArray(n) {1}
        for (i in 0..<n - 1) {
            prefix[i + 1] = prefix[i] * nums[i]
        }
        for (i in n - 2 downTo 0) {
            suffix[i] = suffix[i + 1] * nums[i + 1]
        }
        for (i in nums.indices) {
            nums[i] = prefix[i] * suffix[i]
        }
        return nums
    }
}