open class Point(var x:Int, var y:Int){
   constructor(value:Int):this(x=value,y=value){
      println("Secondary constructor with parameter")
   }
   constructor():this(value=0){
      println("Secondary constructor")
   }
   init {
      println("Primary constructor")
   }
}

// TPoint 클래스 정의
class TPoint(var z:Int, x:Int , y:Int ):Point(x, y)

fun main() {
   val p = Point(x=10, y=20)

   // TPoint 객체 생성
   val tp = TPoint(1,2,3)
}