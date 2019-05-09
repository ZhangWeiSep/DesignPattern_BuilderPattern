package com.example.demo.model;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @pathName：EagleModel
 * @author：ZhangWei
 */
public abstract class EagleModel {

    /**
     * 规定方法执行顺序
     */
    @Setter
    private List<String> sequence = Lists.newArrayList();

    /**
     * 开始
     */
    abstract void start();

    /**
     * 飞翔
     */
    abstract void fly();

    /**
     * 发出叫声
     */
    abstract void call();

    /**
     * 停止
     */
    abstract void stop();

    /**
     * 开始行动
     * 这里模板方法加入final修饰，防止被覆写
     */
    final public void move() {
        sequence.forEach(value -> {
            if (StringUtils.equals("start", value)) {
                this.start();
            } else if (StringUtils.equals("fly", value)) {
                this.fly();
            } else if (StringUtils.equals("call", value)) {
                this.call();
            } else if (StringUtils.equals("stop", value)) {
                this.stop();
            }
        });
    }

}
