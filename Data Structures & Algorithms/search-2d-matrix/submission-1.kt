class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val m = matrix.size
        val n = matrix[0].size
        var i = 0
        var j = m - 1
        while (i <= j) {
            val middle = i + (j - i) / 2
            if (matrix[middle][0] == target) {
                return true
            }
            else if (matrix[middle][0] < target) {
                i = middle + 1
            }
            else {
                j = middle - 1
            }
        }
        val row = i - 1
        if (row < 0) return false
        i = 0
        j = n - 1
        while (i <= j) {
            val middle = i + (j - i) / 2
            if (matrix[row][middle] == target) {
                return true
            }
            else if (matrix[row][middle] < target) {
                i = middle + 1
            }
            else {
                j = middle - 1
            }
        }
        return false

    }
}
