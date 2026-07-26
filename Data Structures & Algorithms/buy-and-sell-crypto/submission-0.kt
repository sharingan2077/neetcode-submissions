class Solution {
    fun maxProfit(prices: IntArray): Int {

        var res = 0
        var min = Int.MAX_VALUE
        for (i in prices.indices) {
            res = maxOf(res, prices[i] - min)
            min = minOf(min, prices[i])
        }
        return res

    }
}
