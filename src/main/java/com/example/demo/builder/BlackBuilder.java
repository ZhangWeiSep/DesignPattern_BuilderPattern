package com.example.demo.builder;

import com.example.demo.model.BlackEagle;
import com.example.demo.model.EagleModel;

import java.util.List;

/**
 * @pathName：BlackBuilder
 * @author：ZhangWei
 */
public class BlackBuilder extends EagleBuilder {

    private BlackEagle blackEagle = new BlackEagle();

    /**
     * 建造一个模型，提供一个执行方法的顺序
     *
     * @param sequence
     */
    @Override
    public void setSequence(List sequence) {
        this.blackEagle.setSequence(sequence);
    }

    /**
     * 获得建造完成的模型
     *
     * @return
     */
    @Override
    public EagleModel getEagleModel() {
        return this.blackEagle;
    }

}
