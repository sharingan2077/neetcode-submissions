class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = mutableListOf<MutableList<String>>()
        val map = HashMap<Map<Char,Int>, MutableList<String>>()

        for (s in strs) {
            val count = s.groupingBy { it }.eachCount()
            if (count in map) {
                map[count]?.add(s)
            }
            else {
                map[count] = mutableListOf(s)
            }
        }
        return map.values.toList()
    }
}