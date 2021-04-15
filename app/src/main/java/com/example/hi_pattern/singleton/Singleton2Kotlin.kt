package com.example.hi_pattern.singleton

/**
 * 作者：haoshuai on 2021/4/14 17:10
 * 邮箱：
 * desc：懒汉
 */
class Singleton2Kotlin private constructor() {

    companion object {
        private var instance: Singleton2Kotlin? = null
            get() {
                if (field == null) {
                    field = Singleton2Kotlin()
                }
                return field
            }
        @Synchronized
        fun get(): Singleton2Kotlin {
            return instance!!
        }
    }
}