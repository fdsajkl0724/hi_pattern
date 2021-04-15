package com.example.hi_pattern.singleton;

/**
 * 作者：haoshuai on 2021/4/14 17:15
 * 邮箱：
 * desc：双重校验锁
 */

public class Singleton3Java {

    private volatile static Singleton3Java instance;

    private Singleton3Java(){}

    public static Singleton3Java getInstance(){
        if (instance == null) {
            synchronized (Singleton3Java.class){
                if (instance==null){
                    instance = new Singleton3Java();
                }
            }
        }
        return instance;
    }
}
