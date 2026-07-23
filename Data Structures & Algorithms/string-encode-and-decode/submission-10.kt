class Solution {
    fun encode(strs: List<String>): String {
        if (strs.isEmpty()) return ""
        val builder = StringBuilder()
        for (s in strs) {
            builder.append(s.length)
            builder.append(',')
        }
        return builder.toString() + "#" + strs.joinToString("")
    }

    fun decode(encoded: String): List<String> {
        if (encoded.isEmpty()) return emptyList()
        val arr = encoded.split("#", limit = 2)
        val sized = arr[0].split(",")
        val s = arr[1]
        val res = mutableListOf<String>()
        var i = 0
        for (size in sized) {
            if (size.isEmpty()) continue
            val len = size.toInt()
            res.add(s.substring(i, i + len))
            i += len
        }
        return res


    }
}