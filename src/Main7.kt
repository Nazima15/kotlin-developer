data class Student(var id:Int, var name:String){
    var age:Int=0
}

fun main(){
    val s1=Student(id=1, name="Santiago")
    val s2=Student(id=2, name="Santiago")

    println(s1===s2) //참조 주소 비교
    println(s1 == s2) //s1.equals(s2)
    println(s1.toString())
}