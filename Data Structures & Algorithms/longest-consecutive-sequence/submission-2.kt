class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.size == 0) return 0
        val set = nums.toHashSet()
        val copySet = nums.toHashSet()
        for (num in copySet) {
            if (num - 1 in set) {
                set.remove(num)
            }
        }
        var res = 1
        var count = 1
        for (num in set) {
            var curr = num + 1
            while (curr in copySet) {
                count++
                res = maxOf(res, count)
                copySet.remove(curr)
                curr++
            }
            count = 1
        }
        return res
    }
}

