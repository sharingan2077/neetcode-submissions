/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }

1 2 3 4
  |   |
  _____
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null || head.next == null) return false

        var slow = head
        var fast = head

        while (fast != null) {
            slow = slow?.next
            fast = fast?.next?.next

            if (slow === fast) return true
        }

        return false


    }
}
