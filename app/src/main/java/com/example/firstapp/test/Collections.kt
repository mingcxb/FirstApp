package com.example.firstapp.test


// 在kt文件中 键入“psvm” 可以自动生成main函数
// Creating a main function automatically with imputing 'psvm' in a KT-type file
fun main() {

    //The size of this List can be changed
    val list = mutableListOf<String>()
    list.add("Japan")
    list.add(1, "UK")
    list.add("US")

    list.forEach {
        println(it)
    }

    //The size of this List can NOT be changed
    val list2 = listOf<Int>(1, 2, 3, 4, 5)

    //key value object
    val pair = Pair("key", "value")
    println(pair)

    //creating an object and using its function
    Test().a()

    //using a companion function
    Test.read(12, 3)

    //using default parameter to call a method
    Test.read(start = 3)

    //using a static function
    StaticClass.sayHello()

    //calling a method with another method as a parameter
    StaticClass.read1() {
        println("executing")
        // The last line is a default returned value
        "test"
    }

    //calling a method with another method as a parameter
    StaticClass.read1(action = {"test2"})

    val appendString = StaticClass.append('3', '4', '3', 'd', 'h')
    println("appendString:${appendString}")

    // 直接將字符數組作爲參數傳入
    val chars = charArrayOf('a', 'b', 'c','d')
    StaticClass.append('3', '4', '3', 'd', 'h', *chars)
}

class Test {

    fun a(): Int {

        return 1
    }

    companion object {
        fun read(offset: Int = 0, start: Int) {
            println("offset=${offset}, start=${start}")
        }
    }

}

object StaticClass{
    fun sayHello(): String{
        return "Hello World"
    }

    // this method needs another method as parameter to call
    fun read1(action: () -> String): String {
        // to call the method that is put in
        val str = action() //需要显示的调用action方法，否则不会执行
        println("read1 executing")
        return "This is method: read1"
    }

    //The number of parameters is mutable
    fun append(vararg chars: Char): String {
        val sb = StringBuffer()
        for(c in chars) {
            sb.append(c)
        }
        return sb.toString()
    }
}