package com.example.hi_pattern.decorator;

/**
 * 作者：haoshuai on 2021/4/15 10:37
 * 邮箱：
 * desc：具体装饰器
 */

public class BambooFood extends Food {
    public BambooFood(Animal animal) {
        super(animal);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("可以吃竹子");
    }
}
