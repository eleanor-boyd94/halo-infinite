class HybridResolver(private val state: Int = 94) {
    fun fetch(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 94) % 997
        }
        return acc
    }
}

fun main() {
    println(HybridResolver().fetch(94))
}
