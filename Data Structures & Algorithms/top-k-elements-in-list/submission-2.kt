class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val arr = IntArray(k)
        val buckets = MutableList<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        val map = nums.groupBy { it }.mapValues { it.value.size }
        for ((k, v) in map) {
            buckets[v].add(k)
        }
        var count = 0
        firstFor@ for (i in buckets.size - 1 downTo 0) {

            for (j in buckets[i].indices) {
                arr[count] = buckets[i][j]
                count++
                if (count == k) {
                    break@firstFor
                }
            }

        }
        return arr

    }
}