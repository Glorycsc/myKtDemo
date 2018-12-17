package com.glory

import org.omg.CORBA.INTERNAL

fun main(args: Array<String>) {

    //当arg是null的时候,会执行/返回[?:]后面的
    //不为null的情况正常,后面的不会执行到
//    val arg: String? = null
//    val arg1 = arg?.toInt() ?: -1
//    println(arg1)


    println(parseInt("55"))
    println(parseInt(null))
}

//当一个返回值可以为null的时候,必须明确说明
fun parseInt(str: String?): String? {
    return str
}

//当前面判断过不能为空的情况,编译器,会在后面的代码默认该变量为非空

val s1 = "ss"
val s2 = "sss"
fun printStr() {
    if (s1 != null && s2 != null) {
        print(s1 + s2)
    }
}

