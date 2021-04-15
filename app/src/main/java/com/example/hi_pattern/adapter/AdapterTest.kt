package com.example.hi_pattern.adapter

/**
 * 作者：haoshuai on 2021/4/15 13:22
 * 邮箱：
 * desc：
 */
fun main() {
    //类适配器模式
    val adapterClass =AdapterClass()
    adapterClass.apply {
        request1()
        request2()
    }

    //对象适配器模式
    val adaptee =Adaptee()
    val adapterObj = AdapterObj(adaptee)
    adapterObj.apply {
        request1()
        request2()

    }
}