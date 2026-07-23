class Solution {

    fun encode(strs: List<String>): String {
        val builder = StringBuilder()
        for (s in strs) {
            for (ch in s) {
                builder.append(ch.code)
                builder.append('.')
            }
            if (s == "") {
                builder.append('?')
            }
            if (builder.length > 1 && s != "") builder.deleteAt(builder.length - 1)
            builder.append(',')
        }
        if (builder.length > 1) builder.deleteAt(builder.length - 1)
        return builder.toString()
    }

    fun decode(str: String): List<String> {
        val res = mutableListOf<String>()
        val builder = StringBuilder()
        var code = 0
        var mnoz = 1
        var filling = false
        for (i in str.length - 1 downTo 0) {

            if (str[i] == '.') {
                val symbol = Char(code)
                builder.append(symbol)
                code = 0
                mnoz = 1
            }
            else if (str[i] == '?') {
                res.add("")
                filling = false
            }
            else if (str[i] == ',') {
                if (filling) {
                    val symbol = Char(code)
                    builder.append(symbol)
                    res.add(builder.reversed().toString())
                    builder.clear()
                    code = 0
                    mnoz = 1
                    filling = false
                }

            }
            else {
                filling = true
                code += mnoz * (str[i] - '0')
                mnoz *= 10
            }
        }
        if (filling) {
            val symbol = Char(code)
            builder.append(symbol)
            res.add(builder.reversed().toString())
        }
        builder.clear()
        return res.reversed()
    }
}
