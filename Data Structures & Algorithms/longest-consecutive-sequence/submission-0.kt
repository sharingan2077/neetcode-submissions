class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.size == 0) return 0
        val set = nums.toHashSet()
        val copySet = nums.toHashSet()
        for (num in copySet) {
            var curr = num + 1
            while (curr in set) {
                set.remove(curr)
                curr++
            }
        }
        val secondSet = nums.toHashSet()
        var res = 1
        var count = 1
        secondSet -= set
        for (num in set) {
            var curr = num + 1
            while (curr in secondSet) {
                count++
                res = maxOf(res, count)
                secondSet.remove(curr)
                curr++
            }
            count = 1
        }
        return res
    }
}

