package com.example.hi_pattern.decorator;

/**
 * 作者：haoshuai on 2021/4/15 10:06
 * 邮箱：
 * desc：装饰器
 */

public abstract class Food implements Animal {
    Animal animal;

    public Food(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eat() {
        animal.eat();
    }
}
