fun main()
{
//    Soal 1
    var age = 16
    println(age)
    age = 30
    println(age)

//    Soal 2
    val degree: Double = 270.0
    val pi = 22/7
    val radian = degree / (pi * 180)
    println(radian)

//    Soal 3
    val coordinates = Pair(2, 3)
    val (column, row) = coordinates
    println(column)
    println(row)

//    Soal 4
    print("Month: ")
    val month = readln()
    print("Year: ")
    val year = Integer.valueOf(readln())
    println("Total days in $month $year are ${daysInMonth(month, year)} days")

//    Soal 5
    print("x = ")
    val x = Integer.valueOf(readln())
    println("Fibonacci ke-$x adalah ${fibonacci(x)}")
}

fun isLeapYear(year: Int): Boolean = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

fun daysInMonth(month: String, year: Int): Int
{
    return when (month)
    {
        "January", "March", "May", "July", "August", "October", "December" -> 31
        "April", "June", "September", "November" -> 30
        "February" -> if (isLeapYear(year)) 29 else 28
        else -> throw IllegalArgumentException("Nama bulan tidak valid")
    }
}

fun fibonacci(x: Int): Int
{
    return if (x == 1 || x == 2)
    {
        1
    }
    else
    {
        fibonacci(x - 1) + fibonacci(x - 2)
    }
}