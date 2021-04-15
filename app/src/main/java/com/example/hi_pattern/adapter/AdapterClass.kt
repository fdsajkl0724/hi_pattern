package com.example.hi_pattern.adapter

/**
 * 作者：haoshuai on 2021/4/15 13:20
 * 邮箱：
 * desc：
 */
class AdapterClass:Adaptee(),Target {
    /**
     * 由于源类Adaptee没有方法request2()
     * 因此适配器需要补充上这方法
     */
    override fun request2() {
        println("AdapterClass:request2")
    }

    override fun request1() {
        super.request1()
    }
}