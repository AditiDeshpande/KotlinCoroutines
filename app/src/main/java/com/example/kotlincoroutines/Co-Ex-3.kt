package com.example.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

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

//Now with Threads

/*fun main() =
    repeat(100_000){
        //Launch a lot of coroutines
        thread {
            Thread.sleep(5000L)
            print(".")
        }
    }*/
/*
Exception in thread "main" java.lang.OutOfMemoryError: unable to create new native thread
	at java.lang.Thread.start0(Native Method)
	at java.lang.Thread.start(Thread.java:717)
	at kotlin.concurrent.ThreadsKt.thread(Thread.kt:42)
	at kotlin.concurrent.ThreadsKt.thread$default(Thread.kt:25)
	at com.example.kotlincoroutines.Co_Ex_3Kt.main(Co-Ex-3.kt:28)
	at com.example.kotlincoroutines.Co_Ex_3Kt.main(Co-Ex-3.kt)
......................................................................................................
After the exception..... at the end started printing the dots
 */