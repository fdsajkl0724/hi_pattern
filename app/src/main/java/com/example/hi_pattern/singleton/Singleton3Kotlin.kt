package com.example.hi_pattern.singleton

/**
 * 作者：haoshuai on 2021/4/14 17:19
 * 邮箱：
 * desc：双重校验锁
 */
class Singleton3Kotlin private constructor(){
    companion object{
        val INSTANCE:Singleton3Kotlin by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            Singleton3Kotlin()
        }
    }
}