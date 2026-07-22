class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val newS = s.toCharArray().sorted()
        val newT = t.toCharArray().sorted()
        for (i in s.indices) {
            if (newS[i] != newT[i]) return false
        }
        return true

    }
}
