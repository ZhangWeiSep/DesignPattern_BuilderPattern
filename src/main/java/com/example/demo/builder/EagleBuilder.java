package com.example.demo.builder;

import com.example.demo.model.EagleModel;

import java.util.List;

/**
 * 建造者模型类
 * @pathName：EagleBuilder
 * @author：ZhangWei
 */
public abstract class EagleBuilder {

    /**
     * 建造一个模型，提供一个执行方法的顺序
     * @param sequence
     */
    public abstract void setSequence(List sequence);

    /**
     * 获得建造完成的模型
     * @return
     */
    public abstract EagleModel getEagleModel();

}
