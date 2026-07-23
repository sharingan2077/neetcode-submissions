class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val arr = IntArray(k)
        val map = HashMap<Int,Int>()
        for (num in nums) {
            map[num] = (map[num] ?: 0) + 1
        }
        val queue = PriorityQueue<Pair<Int, Int>>(compareBy {it.first})
        for ((key, v) in map) {
            queue.add(Pair(v, key))
            if (queue.size > k) {
                queue.poll()
            }
        }
        for (i in 0..<k) {
            arr[i] = queue.poll().second
        }
        return arr

    }
}