/*

0 1 2 5 10 12 14

6
T T T T F F F

-1
F F F F F F F

0
T F F F F F F

15
T T T T T T T
*/



class TimeMap() {

    val map = HashMap<String, MutableList<Pair<String, Int>>>()

    fun set(key: String, value: String, timestamp: Int) {
        map.getOrPut(key) {mutableListOf()}.add(value to timestamp)
    }

    fun get(key: String, timestamp: Int): String {

        val list = map[key] ?: return ""

        var left = 0
        var right = list.lastIndex

        while (left < right) {
            val mid = left + (right - left) / 2 + (right - left) % 2

            if (list[mid].second <= timestamp) {
                left = mid
            }
            else {
                right = mid - 1
            }
        }
        if (list[left].second > timestamp) return ""

        else return list[left].first
    }
}
