class Rectangle {
    var width: Int = 0
        set(value){ if(value >= 0) field = value }

    var height: Int = 0
        set(value){ if(value >= 0) field = value }

    val area: Int
        get() = width * height
}

fun main() {
    val rect = Rectangle()
    rect.width = 5 //rect.setWidth(5);
    rect.height = 4 //rect.setHeight(4);
    println("${rect.width} * ${rect.height} = ${rect.area}")

    rect.height = -4 //음수가 들어오면 무시한다.
    println("${rect.width} * ${rect.height} = ${rect.area}")
}