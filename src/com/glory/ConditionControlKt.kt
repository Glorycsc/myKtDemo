package com.glory

fun main(args: Array<String>) {
    ifExpression()
    whenExperssion()
}

/**
条件控制语句*/
//----------------------------------------------if 表达式 -------------------------------------------------------------------
/**一个 if 语句包含一个布尔表达式和一条或多条语句。
支持所有的java传统用法
另外有几个新特性
 */
fun ifExpression() {
    //第一个 作为表达式
    val a = 3
    val b = 4
    val max = if (a > b) a else b
    println(max)
    //我们也可以把 IF 表达式的结果赋值给一个变量。
    val min = if (a < b) {
        print("Choose a")
        a //最后一行默认就是返回值
    } else {
        print("Choose b")
        b
    }
    println(min)


    //if表达式可以判断是否在区间内
    if (2 in 1..8)
        println("在区间内")
    else
        println("不在区间内")
}


//----------------------------------------------when 表达式 -------------------------------------------------------------------
/**
when 将它的参数和所有的分支条件顺序比较，直到某个分支满足条件。
when 既可以被当做表达式使用也可以被当做语句使用。如果它被当做表达式，符合条件的分支的值就是整个表达式的值，如果当做语句使用， 则忽略个别分支的值
 */

fun whenExperssion() {

    var x = 0
    when (x) {
        //当有多个分支相同的时候可以谢在同一个条件语句中,用[,]分开
        0, 1 -> println("这个数是0或者这个数是1")
        2 -> println("这个数是2")
        else -> println("都不是")
    }

    //when可以结合 in 判断是否在某个区间,某个数组或者某个集合, 结合 is 判断是否是特定类型
    val arrays = arrayOf("this", "is", "my", "phone")
    var sets = setOf("s", "o", "f", "t")
    when {
        "f" in sets -> println("f在集合中")
        "is" in arrays -> println("is在数组中") // 不会执行到,当有一个匹配到,执行了,后面的默认不会在执行
    }

}