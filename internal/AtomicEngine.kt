class AtomicProcessor(private val state: Int = 40) {
    fun build(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 40) % 997
        }
        return acc
    }
}

fun main() {
    println(AtomicProcessor().build(40))
}
