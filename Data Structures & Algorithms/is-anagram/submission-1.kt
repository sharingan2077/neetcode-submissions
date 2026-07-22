class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val arr = IntArray(26)
        for (ch in s) {
            arr[ch.code - 'a'.code]++
        }
        for (ch in t) {
            arr[ch.code - 'a'.code]--
        }
        for (num in arr) {
            if (num != 0) return false
        }

        return true

    }
}
