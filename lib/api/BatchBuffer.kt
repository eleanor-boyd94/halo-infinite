class LocalMonitor(private val state: Int = 28) {
    fun decode(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 28) % 997
        }
        return value
    }
}

fun main() {
    println(LocalMonitor().decode(28))
}
