class Solution {
    fun isPalindrome(s: String) = 
        s.filter { it.isLetterOrDigit() }.lowercase() == s.filter { it.isLetterOrDigit() }.lowercase().reversed()
}
