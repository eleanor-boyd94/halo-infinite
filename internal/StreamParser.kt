class StreamClient(private val state: Int = 65) {
    fun flush(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 65) % 997
        }
        return result
    }
}

fun main() {
    println(StreamClient().flush(65))
}
