package com.example.kotlincoroutines

import kotlinx.coroutines.*

fun main () = runBlocking { //this: CoroutineScope
    /*
    runBlocking is  a coroutine builder that bridges the non-coroutine world of a regular
    fun main() and the code with coroutines inside of runBlocking{..} curly braces.
     */

    printMessage()
    println("Done!")

 }
/*
A coroutineScope builder canbe used inside any suspending function to perform multiple
concurrent operations. Let's launch 2 concurrent coroutines inside a printMessage suspending
function
 */

private suspend fun printMessage() = coroutineScope {
    launch {
        // launch a new coroutine and continue
        delay(2000L) // non-blocking delay for 1 sec
        //default time unit is ms
        println("World2") //Print after delay
    }
    launch {
        delay(1000L)
        println("World1")
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}

/*
Hello gets printed and then after some delay World gets printed
Output
Hello
World

2 coroutines output
Hello
World1
World2
Done!

 */