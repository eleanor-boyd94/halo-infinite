class AsyncController(private val state: Int = 76) {
    fun sync(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 76) % 997
        }
        return total
    }
}

fun main() {
    println(AsyncController().sync(76))
}
