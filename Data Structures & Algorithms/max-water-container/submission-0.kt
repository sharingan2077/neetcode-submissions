class Solution {
    fun maxArea(heights: IntArray): Int {
        var i = 0
        var j = heights.size - 1
        var res = 0
        while (i < j) {
            res = maxOf(res, minOf(heights[i], heights[j]) * (j - i))
            if (heights[i] < heights[j]) {
                i++
            }
            else {
                j--
            }
        }
        return res

    }
}
