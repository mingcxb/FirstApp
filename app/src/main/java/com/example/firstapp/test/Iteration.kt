package com.example.firstapp.test

// 在kt文件中 键入“psvm” 可以自动生成main函数
fun main() {

    val arrStr = arrayOf("Java", "Mysql", "Spring", "Maven", "Git", "Hibernate")

    for (i in arrStr) {
        print(" $i")
    }

    println()
    arrStr.forEach { it ->
        print(" $it")
    }

    println()
    arrStr.forEachIndexed { index, item ->
        print(" $index:$item")
    }


    println()
    for (i in 1..10) {
        print(" $i")
    }


    println()
    for (i in 1 until 10) {
        print(" $i")
    }


}

