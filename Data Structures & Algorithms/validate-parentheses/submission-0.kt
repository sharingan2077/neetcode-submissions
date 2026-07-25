class Solution {
    fun isValid(s: String): Boolean {
        val map = mapOf(')' to '(', '}' to '{', ']' to '[')
        val stack = ArrayDeque<Char>()

        for (ch in s) {
            if (ch in map) {
                if (stack.isEmpty() || (stack.removeLast() != (map[ch] ?: '?'))) {
                    return false
                }
            }
            else stack.add(ch)
        }
        return stack.isEmpty()

    }
}
