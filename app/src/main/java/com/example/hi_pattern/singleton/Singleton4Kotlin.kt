package com.example.hi_pattern.singleton

/**
 * 作者：haoshuai on 2021/4/14 17:46
 * 邮箱：
 * desc：静态内部类
 */
class Singleton4Kotlin {
    companion object{
        val instance =SingletonProvider.holder
    }

    private object SingletonProvider{
        val holder=Singleton4Kotlin()
    }
}