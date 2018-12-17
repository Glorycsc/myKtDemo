package com.glory

/**
区间
区间表达式由具有操作符形式 .. 的 rangeTo 函数辅以 in 和 !in 形成。

 */

fun main(args: Array<String>) {
    for (i in 1..5) print(i) //输出 1 2 3 4 5   表示的是 1<=i&&i<=5 这个区间的值
    for (i in 5..1) print(i) // 什么都不会输出,因为这个范围就是空的

    println()

    //可以指定步长
    for (i in 1..4 step 2) print(i) //输出 1 3
    for (i in 4 downTo 1 step 2) print(i) // 输出 4 2   (downTo 是 [..] 运算符的反转)

    println()

    //使用until排除结尾元素, 半闭半开区间
    for (i in 1 until 4) print(i)  //输出1 2 3  表示只有[1,4) 1<=i&&i<4
}