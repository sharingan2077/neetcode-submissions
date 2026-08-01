
class Solution {
    fun reorderList(head: ListNode?): Unit {
        if (head == null) return

        var slow = head
        var fast = head

        while (fast != null) {
            slow = slow?.next
            fast = fast.next?.next
        }
        fast = slow
        var prev: ListNode? = null
        while (fast != null) {
            val temp = fast.next
            fast.next = prev
            prev = fast
            fast = temp
        }

        var curr = head
        var left = head.next
        var right = prev

        while (left != null && right != null  && curr != null) {
            curr.next = right
            right = right.next
            curr = curr.next
            curr?.next = left
            if (left.next == slow && right == null) {
                left.next = null
                break
            }
            left = left.next
            curr = curr?.next
        }


    }
}