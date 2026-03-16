class Position(var x: Int, var y: Int)

class Rectangle2 {
    lateinit var position: Position

    fun draw() {
        if(::position.isInitialized){
            println("Drawing $position")
        }
    }
}

fun main(){
    val rectangle = Rectangle2()

    //rectangle.position = Position(10,20)
    rectangle.draw()
}