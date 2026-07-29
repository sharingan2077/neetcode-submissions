class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        val head = ListNode(0)
        var curr: ListNode? = head
        var curr1 = list1
        var curr2 = list2
        while (curr1 != null || curr2 != null) {
            if (curr1 == null || (curr2 != null && (curr2.`val` <= curr1.`val`))) {
                curr?.next = curr2
                curr2 = curr2?.next
            }
            else {
                curr?.next = curr1
                curr1 = curr1.next
            }
            curr = curr?.next
        }
        return head.next
    }
}
