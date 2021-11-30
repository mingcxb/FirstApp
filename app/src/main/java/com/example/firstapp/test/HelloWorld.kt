package com.example.firstapp.test


// psvm 快速生成main（）方法
fun main() {
    val str1 = "Hello World!"
    println("Says:${str1}")


    val arr = arrayOf(1, 2, 3, 54, 6, 4)
    println(arr[2])

    val arr2 = arrayOfNulls<String>(5)
    arr2[0] = "One"
    arr2[1] = "Two"
    arr2[2] = "Three"
    arr2[3] = "Four"
    arr2[4] = "five"

    for (i in arr2) {
        println(i)
    }





}