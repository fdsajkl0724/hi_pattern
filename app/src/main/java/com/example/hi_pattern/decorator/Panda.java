package com.example.hi_pattern.decorator;

/**
 * 作者：haoshuai on 2021/4/15 10:04
 * 邮箱：
 * desc：被装饰者
 */

public class Panda implements Animal {
    @Override
    public void eat() {
        System.out.println("什么都么有，不知道吃什么");
    }
}
