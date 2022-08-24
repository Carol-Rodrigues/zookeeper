fun main() {
    // write your code here
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()
    val n4 = readln().toInt()
    val n5 = readln().toInt()
    val range1 = n1..n2
    val range2 = n3..n4
    val check = (n5 in range1) && (n5 in range2)

    println("$check")
}
