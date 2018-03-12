fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val X = readLine()!!
    
    val x_ = X.split(' ').map(String::toDouble)
    val x = x_.sorted()
    
    var middle = N / 2
    var Q1Upper: Int
    var Q3Lower: Int
    var Q1: Double
    var Q2: Double
    var Q3: Double
    if (x.size % 2 == 1) {
        Q2 = x[middle]
        Q1Upper = middle - 1
        Q3Lower = middle + 1
    } else {
        Q2 = (x[middle-1] + x[middle]) / 2.0
        Q1Upper = middle -1
        Q3Lower = middle
    }

    middle = (Q1Upper+1) / 2
    if ((Q1Upper+1)%2 == 1) {
        Q1 = x[middle]
    } else {
        Q1 = (x[middle-1] + x[middle]) / 2.0
    }

    
    middle = ((N - Q3Lower) / 2) + Q3Lower
    if ((N - Q3Lower)%2 == 1) {
        Q3 = x[middle]
    } else {
        Q3 = (x[middle-1] + x[middle]) / 2.0
    }
    
    println(Math.round(Q1))
    println(Math.round(Q2))
    println(Math.round(Q3))
}