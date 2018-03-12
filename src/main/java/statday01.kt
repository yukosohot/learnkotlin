fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val X = readLine()!!
    
    val a = X.split(' ').map(String::toInt)
    val b = a.sorted()

/*
println("what is type of a?")
println(a.javaClass.name)
println(a.javaClass.kotlin)
println(a.javaClass.kotlin.qualifiedName)
println("actually it is Kotlin List based on .split function")
*/
    println("%.1f".format(a.average()))
    
    val middle = N / 2   //b.size / 2
    var median: Double
    if (b.size % 2 == 1) {
        median = b[middle].toDouble();
    } else {
        median = (b[middle-1].toDouble() + b[middle].toDouble()) / 2.0
    }
    println("%.1f".format(median))
    
    var mode: Int
    var maxValue = 0
    var maxCount = 0
    for (i in b.indices) {
        var count = 0
        for (j in b.indices) {
            if (b[j] == b[i]) ++count
        }
        if (count > maxCount) {
            maxCount = count
            maxValue = b[i]
        }
    }

    mode = maxValue
    println(mode)
}