package com.example.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    repeat(100_000){
        //Launch a lot of coroutines
        launch {
            delay(5000L)
            print(".")
        }
    }
}
/*
Output
It launches 100K coroutines and, after 5 seconds,
each coroutine prints a dot.
 */

