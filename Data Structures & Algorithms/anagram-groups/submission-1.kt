class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = mutableListOf<MutableList<String>>()
        val map = HashMap<List<Int>, MutableList<String>>()

        for (s in strs) {
            val count = MutableList<Int>(26) {0}
            for (ch in s) {
                count[ch.code - 'a'.code]++
            }
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
