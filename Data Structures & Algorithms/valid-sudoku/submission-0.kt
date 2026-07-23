class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val arr = IntArray(10)

        for (i in board.indices) {
            for (j in board.indices) {
                if (board[i][j] != '.') {
                    if (arr[board[i][j] - '0'] != 0) {
                        return false
                    }
                    arr[board[i][j] - '0'] = 1
                }
            }
            arr.fill(0)
        }
        for (i in board.indices) {
            for (j in board.indices) {
                if (board[j][i] != '.') {
                    if (arr[board[j][i] - '0'] != 0) {
                        return false
                    }
                    arr[board[j][i] - '0'] = 1
                }
            }
            arr.fill(0)
        }

        for (i in 0..6 step 3) {
            for (j in 0..6 step 3) {
                val res = helper(board, i, j)
                if (!res) return false
            }
        }
        return true
    }

    private fun helper(board: Array<CharArray>, i: Int, j: Int): Boolean {
        val arr = IntArray(10)
        return secondHelper(board, arr, i, j) &&
                secondHelper(board, arr, i, j + 1) &&
                secondHelper(board, arr, i, j + 2) &&
                secondHelper(board, arr, i + 1, j) &&
                secondHelper(board, arr, i + 1, j + 1) &&
                secondHelper(board, arr, i + 1, j + 2) &&
                secondHelper(board, arr, i + 2, j) &&
                secondHelper(board, arr, i + 2, j + 1) &&
                secondHelper(board, arr, i + 2, j + 2)
    }

    private fun secondHelper(board: Array<CharArray>, arr: IntArray, i: Int, j: Int): Boolean {
        if (board[i][j] != '.') {
            if (arr[board[i][j] - '0'] != 0) {
                return false
            }
            arr[board[i][j] - '0'] = 1
        }
        return true
    }
}