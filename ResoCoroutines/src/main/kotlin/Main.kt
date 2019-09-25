import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    exampleBlocking()
}

suspend fun printlnDelayed(message: String) {
    // complex calc
    delay(1000)
    println(message)
}

fun exampleBlocking() = runBlocking {
    println("one")
    printlnDelayed("two")
    println("three")
}

fun exampleBlockingDispatcher() {
    runBlocking(Dispatchers.Default) {
        println("one - from thread ")
    }
}
