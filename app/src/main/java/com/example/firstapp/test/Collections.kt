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

}