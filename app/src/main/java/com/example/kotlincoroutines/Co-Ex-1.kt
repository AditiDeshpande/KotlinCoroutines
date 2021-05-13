package com.example.kotlincoroutines

import kotlinx.coroutines.*

fun main () = runBlocking { //this: CoroutineScope
    /*
    runBlocking is  a coroutine builder that bridges the non-coroutine world of a regular
    fun main() and the code with coroutines inside of runBlocking{..} curly braces.
     */
launch {
    // launch a new coroutine and continue
    delay(1000L) // non-blocking delay for 1 sec
    //default time unit is ms
    println("World") //Print after delay
}
    println("Hello") // main coroutine continues while a previous one is delayed
 }

/*
Hello gets printed and then after some delay World gets printed
Output
Hello
World

 */