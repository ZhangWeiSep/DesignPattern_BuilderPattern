package com.example.demo.model;

import com.example.demo.model.BlackEagle;
import com.google.common.collect.Lists;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ModelMain {

    /**
     * 模板方法模式实现方法执行自定义
     * @param args
     */
    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        BlackEagle blackEagle = new BlackEagle();

        List<String> sequence = Lists.newArrayList();
        sequence.add("start");
        sequence.add("fly");
        sequence.add("stop");

        blackEagle.setSequence(sequence);

        blackEagle.move();
    }

}
