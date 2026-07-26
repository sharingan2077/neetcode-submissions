class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var i = 0
        var res = 0
        val set = HashSet<Char>()
        for (j in s.indices) {
            while (s[j] in set) {
                set.remove(s[i])
                i++
            }
            set.add(s[j])
            res = maxOf(res, set.size)    
        }
        return res

    }
}
