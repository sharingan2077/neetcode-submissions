class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val sortedNums = nums.sorted()
        val res = HashSet<List<Int>>()


        for ((i, num) in sortedNums.withIndex()) {
            val target = -num
            var start = i + 1
            var end = sortedNums.size - 1
            while (start < end) {
                val sum = sortedNums[start] + sortedNums[end]
                if (sum == target) {
                    res.add(listOf(sortedNums[i], sortedNums[start], sortedNums[end]))
                    start++
                    end--
                }
                else if (sum < target) {
                    start++
                }
                else {
                    end--
                }
            }
        }
        return res.toList()

    }
}