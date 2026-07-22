class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()

        for (i in nums.indices) {
            map[nums[i]] = i
        }
        for ( (i, n) in nums.withIndex()) {
            if (map[target - n] != null && i != map[target - n]) {
                return intArrayOf(i, map.getOrDefault(target - n, -1))
            }
        }
        return intArrayOf(-1, -1)

    }
}
