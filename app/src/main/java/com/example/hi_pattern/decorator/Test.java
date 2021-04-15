package com.example.hi_pattern.decorator;

/**
 * 作者：haoshuai on 2021/4/15 10:39
 * 邮箱：
 * desc：
 */

public class Test {
    public static void main(String[] args) {
        Panda panda = new Panda();
        BambooFood bambooFood = new BambooFood(panda);
        CarrotFood carrotFood = new CarrotFood(bambooFood);
        carrotFood.eat();
    }
}
