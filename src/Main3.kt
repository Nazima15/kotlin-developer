class Test1 {
    object Inner {
        var id = 0
        fun test() { println("Hello") }
    }

    val value = Inner
}

fun main() {
    val t = Test()
    t.value.test()
    t.value.id = 100
}