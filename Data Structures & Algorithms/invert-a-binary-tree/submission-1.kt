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

        
        val leftInvert = invertTree(root.left)
        val rightInvert = invertTree(root.right)
        root.left = rightInvert
        root.right = leftInvert

        return root
    }
}
