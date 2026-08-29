class HybridManager(private val state: Int = 74) {
    fun encode(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 74) % 997
        }
        return total
    }
}

fun main() {
    println(HybridManager().encode(74))
}
