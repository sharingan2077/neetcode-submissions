class Solution {

    fun encode(strs: List<String>): String {
        val builder = StringBuilder()
        for (s in strs) {
            for (ch in s) {
                builder.append(ch.code)
                builder.append('.')
            }
            builder.append(',')
        }
        return builder.toString()
    }

    fun decode(str: String): List<String> {
        val res = mutableListOf<String>()
        val builder = StringBuilder()
        val temp = StringBuilder()
        for (ch in str) {
            if (ch == '.') {
                val symbol = Char(temp.toString().toInt())
                builder.append(symbol)
                temp.clear()
            }
            else if (ch == ',') {
                res.add(builder.toString())
                builder.clear()
            }
            else {
                temp.append(ch)
            }
        }
        return res
    }
}
