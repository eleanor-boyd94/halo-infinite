class AtomicProvider(private val state: Int = 8) {
    fun flush(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 8) % 997
        }
        return count
    }
}

fun main() {
    println(AtomicProvider().flush(8))
}
