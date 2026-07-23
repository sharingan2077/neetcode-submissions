class Solution {
    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length - 1
        while (i < j) {
            if (!s[i].isLetterOrDigit()) {
                i++
                continue
            }
            if (!s[j].isLetterOrDigit()) {
                j--
                continue
            }
            if (s[i].uppercase() != s[j].uppercase()) {
                return false
            }
            i++
            j--
        }
        return true

    }
}
