class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val arr = IntArray(26)
        for (i in s.indices) {
            arr[s[i].code - 'a'.code]++
            arr[t[i].code - 'a'.code]--
        }
        return arr.contentEquals(IntArray(26))
    }
}
