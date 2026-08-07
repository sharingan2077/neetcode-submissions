/*

0 1 2 5 10 12 14

6
F F F F T T T

-1
T T T T T T T

0
F T T T T T T

15
F F F F F F F
*/



class TimeMap() {

    val map = HashMap<String, MutableList<Pair<String, Int>>>()

    fun set(key: String, value: String, timestamp: Int) {
        map.getOrPut(key) {mutableListOf()}.add(Pair(value, timestamp))
    }

    fun get(key: String, timestamp: Int): String {

        val list = map[key] ?: mutableListOf()

        var left = 0
        var right = list.size

        while (left < right) {
            val mid = left + (right - left) / 2

            if (list[mid].second > timestamp) {
                right = mid
            }
            else {
                left = mid + 1
            }
        }
        if (left == 0) return ""

        else return list[left - 1].first
    }
}
