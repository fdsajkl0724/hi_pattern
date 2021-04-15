package com.example.hi_pattern.singleton;

/**
 * 作者：haoshuai on 2021/4/14 17:08
 * 邮箱：
 * desc：懒汉 时间换空间
 */

public class Singleton2Java {
    private static Singleton2Java instance ;
    private Singleton2Java(){}

    public static synchronized Singleton2Java getInstance(){
        if (instance == null) {
            instance = new Singleton2Java();
        }
        return instance;
    }
}
