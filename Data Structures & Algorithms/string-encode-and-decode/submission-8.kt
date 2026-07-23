class Solution {

    fun encode(strs: List<String>): String {
        val builder = StringBuilder()
        for (s in strs) {
            builder.append(s.length)
            builder.append("#")
            builder.append(s)
        }
        return builder.toString()
    }

    fun decode(str: String): List<String> {
        val res = mutableListOf<String>()
        val builder = StringBuilder()
        var count = 0
        var found = false
        for (ch in str) {
            if (ch == '#' && !found) {
                count = builder.toString().toInt()
                if (count == 0) {
                    res.add("")
                    builder.clear()
                    found = false
                    continue
                }
                builder.clear()
                found = true
            }
            else if (found) {
                builder.append(ch)
                count--
                if (count == 0) {
                    res.add(builder.toString())
                    builder.clear()
                    found = false
                }
            }
            else {
                builder.append(ch)
            }
        }
        return res
    }
}
