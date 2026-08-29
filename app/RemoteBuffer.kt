class RemoteHandler(private val state: Int = 94) {
    fun flush(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 94) % 997
        }
        return result
    }
}

fun main() {
    println(RemoteHandler().flush(94))
}
