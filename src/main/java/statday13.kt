fun main(args: Array<String>) {
    val N = readLine()!!.toDouble()
    val X = readLine()!!
    
    val x_ = X.split(' ').map(String::toDouble)
    val x = x_.sorted()
    val m = x.average()
    
    var sum = 0.0
    var md: Double
    for (i in x.indices) {
        md = x[i] - m
        sum += md * md
    }
    
    val SD = Math.sqrt(sum/N)
    println("%.1f".format(SD))
}