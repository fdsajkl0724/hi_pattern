package com.example.hi_pattern.builder

/**
 * 作者：haoshuai on 2021/4/15 11:15
 * 邮箱：
 * desc：
 */
class Pen {
    var color:String ="write"
    var width:Float =1.0F
    var round:Boolean = false
    fun write(){
        println("color:${color},width:${width}.round:${round}")
    }
}