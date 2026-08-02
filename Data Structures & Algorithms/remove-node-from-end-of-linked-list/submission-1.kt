/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

 /*
1 -> 2 -> 3 -> 4
          2

1 <- 2 <- 3 <- 4          

 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

        var prev: ListNode? = null
        var curr = head

        while (curr != null) {
            val tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp
        }
        var newHead = prev
        curr = prev
        prev = null

        for (i in 1..<n) {
            prev = curr
            curr = curr?.next
        }

        /*
        null <- 2 <- 3
        */

        if (prev == null) {
            curr = curr?.next
        }
        else {
            prev.next = curr?.next
            curr = newHead
        }

        prev = null

        while (curr != null) {
            val tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp
        }

        return prev
    }
}
