package com.example.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking{
    val job = launch {
        repeat(1000){ i
            -> println("Job: I am sleeping $i")
            delay(500L)
        }
    }
    delay(1300L) // Delay a bit
    println("Main: I am tired of waiting!")
    job.cancel() // cancels the job
    job.join() // waits for job's completion
    println("main: Now I can quit")

}
/*
Output
Job: I am sleeping 0
Job: I am sleeping 1
Job: I am sleeping 2
Main: I am tired of waiting!
main: Now I can quit

Process finished with exit code 0

 */