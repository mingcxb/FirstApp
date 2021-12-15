package com.example.firstapp.test

fun main() {
    // to initialize an array
    val arr = arrayOf(0, 1, 2, 3, 4)

    // the first way to call
    LambdaTest.calculate(arr, action = {index, item ->
        index * item
    })

    // print calculated result
    arr.forEach { it ->
        println(it)
    }

    // the second way to call
    LambdaTest.calculate(arr) {index, item ->
        index * item
    }

    arr.forEach { it ->
        println(it)
    }
}

/**
 * create a static class
 */
object LambdaTest {

    /**
     * to handle the items of the array
     */
    fun calculate(arr: Array<Int>, action: (index: Int, item: Int) -> Int) {
        arr.forEachIndexed { index, num ->
            val result = action(index, num);
            arr[index] = result

        }
    }



}