import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    
    if (n % 2 == 1) {
        println("Weird")
    } else {
        when (n) {
            in 2..5 -> print("Not Weird")
            in 6..20 -> print("Weird")
            else -> { // greater than 20
                print("Not Weird")
            }
        }
    }
    
    reader.close()
}