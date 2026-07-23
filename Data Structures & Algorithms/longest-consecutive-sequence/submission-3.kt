class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.size == 0) return 0
        val set = nums.toSet()
        var res = 0
        for (num in set) {
            if ( (num - 1) !in set) {
                var curr = 1
                while (num + curr in set) {
                    curr++
                }
                res = maxOf(res, curr)
            }
        }
        return res
    }
}

