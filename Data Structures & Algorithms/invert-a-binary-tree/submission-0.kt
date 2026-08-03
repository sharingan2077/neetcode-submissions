/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null

        val tmp = invertTree(root.right)
        root.right = invertTree(root.left)
        root.left = tmp

        return root
    }
}
