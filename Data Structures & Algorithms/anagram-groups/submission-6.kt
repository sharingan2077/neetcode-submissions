class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = mutableListOf<MutableList<String>>()
        val map = HashMap<String, MutableList<String>>()

        for (s in strs) {
            val newS = s.toCharArray().sorted().joinToString("")
            map.getOrPut(newS) { mutableListOf() }.add(s)
        }
        return map.values.toList()
    }
}