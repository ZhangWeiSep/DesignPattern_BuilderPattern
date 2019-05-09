package com.example.demo.builder;

import com.example.demo.model.BlackEagle;
import com.google.common.collect.Lists;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BuilderMain {

    /**
     * 模板方法模式实现方法执行自定义
     * @param args
     */
    public static void main(String[] args) {
        //建造者
        BlackBuilder blackBuilder = new BlackBuilder();
        //方法执行顺序——建造出的模型拥有的方法
        List<String> sequence = Lists.newArrayList();
        sequence.add("start");
        sequence.add("fly");
        sequence.add("stop");
        blackBuilder.setSequence(sequence);
        //建造一个模型
        BlackEagle blackEagle = (BlackEagle) blackBuilder.getEagleModel();
        blackEagle.move();

        //上述是建造了拥有三个方法的模型，接下来在建造一个拥有两个方法的模型
        sequence.clear();
        sequence.add("start");
        sequence.add("fly");
        blackBuilder.setSequence(sequence);

        blackEagle = (BlackEagle) blackBuilder.getEagleModel();
        blackEagle.move();
    }

}
