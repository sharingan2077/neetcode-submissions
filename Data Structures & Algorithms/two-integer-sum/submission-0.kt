class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()

        for (i in nums.indices) {
            if (target - nums[i] in map) {
                return intArrayOf(map[target - nums[i]] ?: 0, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf(-1, -1)

    }
}
