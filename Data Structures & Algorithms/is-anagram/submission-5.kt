class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val arr = IntArray(26)
        for (i in s.indices) {
            arr[s[i].code - 'a'.code]++
            arr[t[i].code - 'a'.code]--
        }
        for (num in arr) {
            if (num != 0) return false
        }
        return true
    }
}
