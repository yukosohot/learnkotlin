import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    val mealCost = reader.nextDouble()
    val tipPercent = reader.nextInt().toDouble()
    val taxPercent = reader.nextInt().toDouble()
    
    val totalCost: Double = mealCost + (mealCost * tipPercent / 100.0) + (mealCost * taxPercent / 100.0)
    
    println("The total meal cost is ${Math.round(totalCost)} dollars.")
    
    reader.close()
}