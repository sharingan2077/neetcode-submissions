/*
piles=[1,2,3,4]
start = 0
end = 3
middle = 1



1 2 3 4 5 6 7 8 9 10    h = 5

2 4 6 10 12 45 6
F F F F F T T T T T 


1  2 3 4   h = 9
10 6 5 4

Первый элемент, который <= 9

F T T T

*/
class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.max()

        while (left < right) {
            val mid = left + (right - left) / 2


            var sum = 0

            for (pile in piles) {
                sum += (pile + mid - 1) / mid
            }
            if (sum <= h) {
                right = mid
            }
            else {
                left = mid + 1
            }
        }

        return left
    }
}
