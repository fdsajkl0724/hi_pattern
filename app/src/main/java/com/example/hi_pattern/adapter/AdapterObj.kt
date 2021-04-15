package com.example.hi_pattern.adapter

/**
 * 作者：haoshuai on 2021/4/15 13:26
 * 邮箱：
 * desc：
 */
class AdapterObj(private var adaptee: Adaptee) :Target{
    override fun request1() {
        adaptee.request1()
    }

    override fun request2() {
        println("AdapterObj:request2")
    }
}