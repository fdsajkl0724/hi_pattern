package com.example.hi_pattern.decorator

/**
 * 作者：haoshuai on 2021/4/15 10:47
 * 邮箱：
 * desc：
 */
fun Panda.bamboo(decorator:()->Unit){
    eat()
    println("可以吃竹子")
    decorator()
}

fun Panda.carrot(decorator:()->Unit){
    println("可以吃胡萝卜")
    decorator()
}

fun main() {
    Panda().run {
        bamboo { carrot {  } }

    }
}