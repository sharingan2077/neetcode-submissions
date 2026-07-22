class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val arr = nums.mapIndexed { index, num -> num to index}.toMutableList()

        arr.sortBy { it.first }

        var i = 0
        var j = arr.size - 1
        while (i < j) {
            val x = arr[i].first
            val y = arr[j].first
            if (x + y == target) {
                return intArrayOf(
                    minOf(arr[i].second, arr[j].second),
                    maxOf(arr[i].second, arr[j].second)
                    )
            }
            if (x + y < target) {
                i++
            }
            else {
                j--
            }
        }
        return intArrayOf()
    } 
}
