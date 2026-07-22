class Solution {
    fun isAnagram(s: String, t: String) = s.toCharArray().sorted() == t.toCharArray().sorted()
}
