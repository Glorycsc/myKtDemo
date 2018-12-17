package com.glory

/**
基本数据类型
Byte     1*8 = 8
Short    2*8 = 16
Int      4*8 = 32
Long     8*8 = 64
Float    4*8 = 32
Double   8*8 = 64
Kotlin 的基本数值类型包括 Byte、Short、Int、Long、Float、Double 等。不同于Java的是，字符不属于数值类型，是一个独立的数据类型。
 */
/**
下面是所有类型的字面常量：
十进制：123
长整型以大写的 L 结尾：123L
16 进制以 0x 开头：0x0F
2 进制以 0b 开头：0b00001011
注意：8进制不支持
Kotlin 同时也支持传统符号表示的浮点数值：
Doubles 默认写法: 123.5, 123.5e10
Floats 使用 f 或者 F 后缀：123.5f
 */


fun main(args: Array<String>) {
    //在Kotlin中所有的数据类型都是对象型的, 所以就有了一个新的运算符 [===] 三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小。
    //***一定要参考这个作者的说明:https://blog.csdn.net/fzhhsa/article/details/83278321
    //Kotlin中设计装箱操作的,情况比较复杂
    val n = 4
    val m = 4
    println(n === m)
    println(n == m)
    val x = 7652
    val y: Int = x
    val z: Int = x
    println(y === z)
    println(y == z)


    createArrays()
    stringKt()
}

//类型转换
fun DataParser(): Unit {
    //除了子类父类的可以直接赋值外,其他的都不能直接复制,不会隐式的转换,需要手动的显示转换
    val b: Byte = 12 // OK, 字面值是静态检测的
//    val i: Int = b // 报错,提示类型不匹配
    val i: Int = b.toInt() //正确的书写方式,要显示调用,toXx()方法转换

    //有些情况下也是可以使用自动类型转化的，前提是可以根据上下文环境推断出正确的数据类型而且数学操作符会做相应的重载。例如下面是正确的：
    val l = 188L + 3 //OK,没有报错, Long + Int => Long
}


/**
对于Int和Long类型，还有一系列的位操作符可以使用，分别是：
shl(bits) – 左移位 (Java’s <<)
shr(bits) – 右移位 (Java’s >>)
ushr(bits) – 无符号右移位 (Java’s >>>)
and(bits) – 与
or(bits) – 或
xor(bits) – 异或
inv() – 反向
 */


//------------------------------------------Char 字符--------------------------------------------------------------------
/**
和 Java 不一样，Kotlin 中的 Char 不能直接和数字操作，Char 必需是单引号 ' 包含起来的。比如普通字符 '0'，'a'。
在Kotlin中如果生命一个Char类型的必须要用''引起来,不能直接使用数字127 这样复制给一个Char类型的变量,回报类型不匹配
特殊字符可以用反斜杠转义。 支持这几个转义序列：\t、 \b、\n、\r、\'、\"、\\ 和 \$。 编码其他字符要用 Unicode 转义序列语法：'\uFF00'。
 */

//------------------------------------------Boolean 布尔-----------------------------------------------------------------
/**布尔
布尔用 Boolean 类型表示，它有两个值：true 和 false。
若需要可空引用布尔会被装箱。
内置的布尔运算有：
1.|| – 短路逻辑或
2.&& – 短路逻辑与
3.! - 逻辑非
 */

//------------------------------------------Array 数组------------------------------------------------------------------
/**
 * 数组用类 Array 实现，并且还有一个 size 属性及 get 和 set 方法，由于使用 [] 重载了 get 和 set 方法，所以我们可以通过下标很方便的获取或者设置数组对应位置的值。
 * 数组的创建两种方式：一种是使用函数arrayOf()；另外一种是使用工厂函数
 */
fun createArrays() {
    //方式一  通过arrayOf()方法
    val array1 = arrayOf(1, 2, 3)
    val array2 = Array(3, { x -> x * 5 })//第一个参数是size就是这个Array数组的大小 第二个是一个lambda表达式,来对前面的数进行操作
    val array3 = Array(3, { i -> "第${i}个" })//第一个参数是size就是这个Array数组的大小 第二个是一个lambda表达式,来对前面的数进行操作
    for (i in array1) print(i)
    for (i in array2) print(i)
    for (i in array3) print(i)

    //以下两种方式效果相同  []运算符底层就是调用的ge(i)方法-- 同理还有set(i) 方法
    println(array3[2])
    println(array3.get(2))


}


//------------------------------------------String 字符串----------------------------------------------------------------
/**
和 Java 一样，String 是不可变的。方括号 [] 语法可以很方便的获取字符串中的某个字符，也可以通过 for 循环来遍历：*/

fun stringKt() {
    //Kotlin中可以很方便的活期字符串中某个位置的字符
    val str = "abcdefg"
    println(str[1]) // 输出b
    println(str[4]) // 输出e

    //Kotlin中我们可以使用["""]表示不可变的原始字符串(写进什么就是什么,不会有任何操作)
    val strOriginal = """zhe
    >shi
    >yuanshi
    >   字符串
    >
    >   汗死额 上
    """.trimMargin(">") // 默认 | 用作边界前缀，但你可以选择其他字符并作为参数传入，比如 trimMargin(">")。
    println(strOriginal)

    //字符串模板 [$]
    //使用字符串模板可以方便的进行字符串拼接
    val money = 10.00f
    val freight = 6.00f
    println("价格:$money") // 输出:价格:10.0
    println("总计:${money + freight}") //输出:总计:16.0

    //如果想输出一个美元$符号
    println("美元$$money")
}