package com.example.hi_pattern.singleton;

/**
 * 作者：haoshuai on 2021/4/14 17:39
 * 邮箱：
 * desc：静态内部类
 */

public class Singleton4Java {
    public static class SingletonProvider{
        private static Singleton4Java instance = new Singleton4Java();
    }
    private Singleton4Java(){}

    public static Singleton4Java getInstance(){
        return SingletonProvider.instance;
    }
}
