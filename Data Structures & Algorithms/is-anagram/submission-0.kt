class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val map = HashMap<Char, Int>()
        for (ch in s) {
            map[ch] = (map[ch] ?: 0) + 1
        } 
        for (ch in t) {
            if (map[ch] == null) return false
            map[ch] = (map[ch] ?: 0) - 1
        }
        for ( (_, value) in map) {
            if (value != 0) return false
        }

        return true

    }
}
