/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

 /*
1 -> 2 -> 3
4 -> 5 -> 6
5 -> 7 -> 9


1 -> 2 -> 3
9 -> 1 -> 2
321 + 219 = 540
0 -> 4 -> 5

1 -> 2 -> 3
2 -> 1 -> 9
321 + 912 = 1233

3 -> 3 -> 2 -> 1

0 -> 0 -> 1
9
100 + 9 = 109
9 -> 0 -> 1

 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        val dummy = ListNode(0)
        var curr = dummy
        var curr1 = l1
        var curr2 = l2
        var carry = 0

        while (curr1 != null || curr2 != null || carry > 0) {
            var sum = carry
            if (curr1 != null) {
                sum += curr1.`val`
                curr1 = curr1.next
            }
            if (curr2 != null) {
                sum += curr2.`val`
                curr2 = curr2.next
            }

            val node = ListNode(sum % 10)
            carry = sum / 10
            curr.next = node
            curr = node
        }

        return dummy.next
        


    }
}
