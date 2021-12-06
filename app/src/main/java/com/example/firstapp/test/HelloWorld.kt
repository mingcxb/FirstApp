package com.example.firstapp.test


// psvm 快速生成main（）方法
fun main() {
    val str1 = "Hello World!"
    println("Says:${str1}")


    // create an array with a group of value
    val arr = arrayOf(1, 2, 3, 54, 6, 4)
    println(arr[2])

    // crate an empty array and set every item's value
    val arr2 = arrayOfNulls<String>(5)
    arr2[0] = "One"
    arr2[1] = "Two"
    arr2[2] = "Three"
    arr2[3] = "Four"
    arr2[4] = "five"

    for (i in arr2) {
        println(i)
    }

    // create an array with Lambda
    val arr3 = Array(5) { i -> (i * i) }
    for (i in arr3) {
        println(i)
    }

    // create an array with a specific value
    val arr4 = Array(5) { 30 }
    for (i in arr4) {
        println(i)
    }


    // create an array with lambda
    val arr5 = Array(5) { it * 2 }
    for (i in arr5) {
        println(i)
    }


    // using index to get array's item
    for (i in arr5.indices) {
        println("$i-> ${arr5[i]}")
    }


    // getting index and item directly
    for ((index, item) in arr5.withIndex()) {
        println("$index-> $item")
    }

    arr4.forEach {
        println(it)
    }

    arr4.forEachIndexed{index, item ->
        println("$index-> $item")
    }

}