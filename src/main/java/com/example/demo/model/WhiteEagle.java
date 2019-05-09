package com.example.demo.model;

/**
 * @pathName：WhiteEagle
 * @author：ZhangWei
 */
public class WhiteEagle extends EagleModel {

    /**
     * 开始
     */
    @Override
    void start() {
        System.out.println("白鹰准备飞翔");
    }

    /**
     * 飞翔
     */
    @Override
    void fly() {
        System.out.println("白鹰飞翔于天空");
    }

    /**
     * 发出叫声
     */
    @Override
    void call() {
        System.out.println("白鹰发出叫声");
    }

    /**
     * 停止
     */
    @Override
    void stop() {
        System.out.println("白鹰落地");
    }

}
