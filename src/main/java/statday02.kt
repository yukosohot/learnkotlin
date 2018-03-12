fun main(args: Array<String>) {
    readLine()!!
    val X = readLine()!!
    val W = readLine()!!
    
    val x = X.split(' ').map(String::toInt)
    val w = W.split(' ').map(String::toInt)

    var sumX = 0
    var sumW = 0
    for (i in x.indices) {
        sumX += x[i] * w[i]
        sumW += w[i]
    }
    val result = sumX.toDouble() / sumW.toDouble()
    println("%.1f".format(result))
}