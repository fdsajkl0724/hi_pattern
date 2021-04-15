package com.example.hi_pattern.decorator;

/**
 * 作者：haoshuai on 2021/4/15 10:38
 * 邮箱：
 * desc：具体装饰器
 */

public class CarrotFood extends Food{
    public CarrotFood(Animal animal) {
        super(animal);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("可以池胡萝卜");
    }
}
