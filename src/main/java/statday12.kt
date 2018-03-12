fun main(args: Array<String>) {
    readLine()!!
    val X = readLine()!!
    val Y = readLine()!!
    
    val x = X.split(' ').map(String::toDouble)
    val y = Y.split(' ').map(String::toDouble)
    
    var zStr = ""
    for (i in x.indices) {
        var j = 0
        while (j < y[i]) {
            zStr += x[i].toString() + ' '
            j++
        }
    }
    
    val z_ = zStr.trim().split(' ').map(String::toDouble)
    val z = z_.sorted()

    var middle = z.size / 2
    var Q1Upper: Int
    var Q3Lower: Int
    var Q1: Double
    //var Q2: Double
    var Q3: Double
    if (z.size % 2 == 1) {
        //Q2 = z[middle]
        Q1Upper = middle - 1
        Q3Lower = middle + 1
    } else {
        //Q2 = (z[middle-1] + z[middle]) / 2.0
        Q1Upper = middle -1
        Q3Lower = middle
    }

    middle = (Q1Upper+1) / 2
    if ((Q1Upper+1)%2 == 1) {
        Q1 = z[middle]
    } else {
        Q1 = (z[middle-1] + z[middle]) / 2.0
    }

    
    middle = ((z.size - Q3Lower) / 2) + Q3Lower
    if ((z.size - Q3Lower)%2 == 1) {
        Q3 = z[middle]
    } else {
        Q3 = (z[middle-1] + z[middle]) / 2.0
    }

    println("%.1f".format(Q3 - Q1))
}