import java.util.Scanner

fun main(args: Array<String>) {
    val i = 4;
    val d = 4.0;
    val s = "HackerRank ";
        
    val reader = Scanner(System.`in`)
    val i2 = reader.nextInt()
    val d2 = reader.nextDouble()
    reader.nextLine()
    val s2 = reader.nextLine()
    
    
    println(i+i2)
    println(d+d2)
    println(s + s2)
    
    reader.close()
}