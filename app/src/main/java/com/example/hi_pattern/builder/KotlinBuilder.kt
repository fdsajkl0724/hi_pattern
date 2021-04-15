package com.example.hi_pattern.builder

/**
 * 作者：haoshuai on 2021/4/15 11:11
 * 邮箱：
 * desc：
 */
fun main() {
    val penJava = PenJava.Builder().color("yellow").width(3f).round(true).build()
    penJava.write()

    val pen =Pen()
    //通过with来实现
    with(pen,{
        color ="red"
        width =2f
        round=true

    })
    //with的第二种用法:使用引用对象，并使用lambda表达式的返回结果
    val numbers = mutableListOf("1","2","3")
    val result = with(numbers){
        "The first element is ${first()},"+"the last element is ${last()}"
    }

    println(result)


    pen.write()

    pen.apply {
        color="gray"
        width =6f
        round =false
        write()
    }

}

