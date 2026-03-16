fun String.times(count:Int):String{
    val str=StringBuilder()
    for (i in 1..count)
        str.append(this)
    return str.toString()
}
fun main(){
    val msg="Hello World"
    println(msg.times(2))
}