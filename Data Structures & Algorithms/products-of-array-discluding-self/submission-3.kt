class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val res = IntArray(n)
        res[0] = 1
        for (i in 1..<n) {
            res[i] = res[i - 1] * nums[i - 1]
        }
        var postfix = 1
        for (i in n - 1 downTo 0) {
            res[i] = res[i] * postfix
            postfix *= nums[i]
        }
        return res
    }
}