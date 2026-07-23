class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefix = IntArray(nums.size)
        prefix[0] = 1
        val suffix = IntArray(nums.size)
        suffix[nums.size - 1] = 1
        for (i in 0..<nums.size - 1) {
            prefix[i + 1] = prefix[i] * nums[i]
            suffix[nums.size - 2 - i] = suffix[nums.size - 1 - i] * nums[nums.size - 1 - i]
        }
        var res = IntArray(nums.size)
        for (i in res.indices) {
            res[i] = prefix[i] * suffix[i]
        }
        return res
    }
}
