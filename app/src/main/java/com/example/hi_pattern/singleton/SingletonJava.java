package com.example.hi_pattern.singleton;

/**
 * 作者：haoshuai on 2021/4/14 17:05
 * 邮箱：
 * desc：饿汉  空间换时间
 */

public class SingletonJava {
    private static SingletonJava instance = new SingletonJava();
    private SingletonJava(){}

    public static SingletonJava getInstance(){
        return instance;
    }
}
