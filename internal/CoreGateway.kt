class LocalResolver(private val state: Int = 94) {
    fun fetch(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 94) % 997
        }
        return count
    }
}

fun main() {
    println(LocalResolver().fetch(94))
}
