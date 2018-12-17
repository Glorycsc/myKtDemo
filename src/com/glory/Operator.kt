package com.glory

import javax.print.Doc

fun main(args: Array<String>) {
    // is 运算符--判断前是否是后这个类型的实例
    val p = Doctor()
    println(p is Doctor)
//    if (p is Doctor)
//        return true
//    return false

    //或者是这种方式
    println(getStringLength("fe"))
    println(getStringLength(88))
}

open class Person constructor()

class Doctor : Person()

//关于if else
fun getStringLength(obj: Any): Int? {
    if (obj !is String) {
        return null
    } else {//此时已经默认了str是String类型的
        return obj.length
    }
}

