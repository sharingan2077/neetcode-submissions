class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()

        for (i in nums.indices) {
            map[nums[i]] = i
        }
        for (i in nums.indices) {
            if (map[target - nums[i]] != null) {
                if (i != (map[target - nums[i]] ?: i)) {
                    return intArrayOf(i, map.getOrDefault(target - nums[i], -1))
                }
            }
        }
        return intArrayOf(-1, -1)

    }
}
