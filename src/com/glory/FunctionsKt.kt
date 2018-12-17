package com.glory

fun main(args: Array<String>) {
    vars("1", "2", "3", "4", "5")
    println(lambs(7, 65))
}

//定义一个方法(常规方式)
fun sum(a: Int, b: Int): Int {
    return a + b
}

//可以省略返回值类型,由编译器自行推断(此时将方法看作一个声明变量的形式)
fun sum1(a: Int, b: Int) = a + b

public fun sum11(a: Int, b: Int): Int = a + b   // public 方法则必须明确写出返回类型


//可变长的参数的函数
fun vars(vararg strs: String) {
    //遍历输出
    for (str in strs) {
        println("$str |")
    }
}


//lambda表达式(定义的时候看作一个变量定义, 不用fun关键字,而是一个val/var)
val lambs: (Int, Int) -> Int = { x, y -> x + y }