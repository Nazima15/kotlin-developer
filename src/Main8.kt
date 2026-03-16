enum class RGB { RED, GREEN, BLUE }
fun main() {
    for( color in RGB.entries){ println(color) }
    println(RGB.RED.name)
    println(RGB.GREEN.ordinal)
}