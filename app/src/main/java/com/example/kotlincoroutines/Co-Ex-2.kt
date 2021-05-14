package com.example.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
An explicit job
A launch coroutine builder returns a Job object that is a handle to the launched coroutine
and can be used to explicitly wait for its completion. e.g u can wait for the completion of the
child coroutine and then print "Done" string
 */


fun main() = runBlocking {
    val job = launch {
        //launch a new coroutine and keep  a reference to it's job
        delay(1000L)
        println("World!")
    }
    println("Hello")
    job.join()// Wait
    println("Done")

}