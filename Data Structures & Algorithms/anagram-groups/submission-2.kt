class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = mutableListOf<MutableList<String>>()
        val map = HashMap<String, MutableList<String>>()

        for (s in strs) {
            val newS = s.toCharArray().sorted().toString()
            if (newS in map) map[newS]?.add(s)
            else map[newS] = mutableListOf(s)
        }
        return map.values.toList()
    }
}
