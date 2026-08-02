/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {
        if (head == null) return null

        val map = HashMap<Node?, Node?>() 
        map[null] = null

        var curr = head

        while (curr != null) {
            val node = Node(curr.`val`)
            map[curr] = node
            curr = curr.next
        }
        curr = head
        while (curr != null) {
            val node = map[curr]
            node?.next = map[curr.next]
            node?.random = map[curr.random]
            curr = curr.next
        }
        return map[head]

    }
}
