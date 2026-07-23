class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val arr = IntArray(k)
        val map = HashMap<Int, Int>()
        for (num in nums) {
            map[num] = (map[num] ?: 0) + 1
        }
        val sorted = map.toList().sortedByDescending { it.second }
        for (index in 0..<k) {
            arr[index] = sorted[index].first
        }
        return arr
    }
}
