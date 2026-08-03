/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        return helper(root, 0)

    }

    fun helper(root: TreeNode?, curr: Int): Int {
        if (root == null) return curr


        return maxOf(helper(root.left, curr + 1), helper(root.right, curr + 1))



    }
}
