
/*
  2 -> 4 -> 6 -> 8 <- 10
                 |
               null

  2 -> 10 -> 4 -> 8 -> 6


  2 -> 4 -> 6 <- 8
            |
           null

  2 -> 8 -> 4 -> 6
*/


class Solution {
    fun reorderList(head: ListNode?): Unit {
        if (head == null) return

        var slow = head
        var fast = head

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }
        fast = slow?.next
        slow?.next = null
        var prev: ListNode? = null
        while (fast != null) {
            val temp = fast.next
            fast.next = prev
            prev = fast
            fast = temp
        }

        var curr = head
        var left = head
        var right = prev

        while (left != null && right != null) {
            val tmp1 = left.next
            val tmp2 = right.next

            left.next = right
            right.next = tmp1
            left = tmp1
            right = tmp2

            
        }


    }
}