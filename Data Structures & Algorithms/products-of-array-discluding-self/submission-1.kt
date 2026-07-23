class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefix = IntArray(nums.size)
        prefix[0] = 1
        val suffix = IntArray(nums.size)
        suffix[nums.size - 1] = 1
        for (i in 0..<nums.size - 1) {
            prefix[i + 1] = prefix[i] * nums[i]
        }
        for (i in nums.size - 2 downTo 0) {
            suffix[i] = suffix[i + 1] * nums[i + 1]
        }
        var res = IntArray(nums.size)
        for (i in res.indices) {
            res[i] = prefix[i] * suffix[i]
        }
        return res
    }
}
