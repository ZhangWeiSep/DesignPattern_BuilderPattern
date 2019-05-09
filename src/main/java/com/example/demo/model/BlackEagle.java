package com.example.demo.model;

/**
 * @pathName：BlackEagle
 * @author：ZhangWei
 */
public class BlackEagle extends EagleModel {
    
    /**
     * 开始
     */
    @Override
    void start() {
        System.out.println("黑鹰准备飞翔");
    }

    /**
     * 飞翔
     */
    @Override
    void fly() {
        System.out.println("黑鹰飞翔于天空");
    }

    /**
     * 发出叫声
     */
    @Override
    void call() {
        System.out.println("黑鹰发出叫声");
    }

    /**
     * 停止
     */
    @Override
    void stop() {
        System.out.println("黑鹰落地");
    }
    
}
