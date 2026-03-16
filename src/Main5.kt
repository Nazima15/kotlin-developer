fun Int.abs() = if (this < 0) -this else this
fun main() {
    var result = 3.abs()
    println(result)
    result = (-1).abs()
    println(result)
} 