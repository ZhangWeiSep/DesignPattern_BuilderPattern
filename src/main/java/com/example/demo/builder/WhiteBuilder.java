package com.example.demo.builder;

import com.example.demo.model.EagleModel;
import com.example.demo.model.WhiteEagle;

import java.util.List;

/**
 * @pathName：WhiteBuilder
 * @author：ZhangWei
 */
public class WhiteBuilder extends EagleBuilder{

    private WhiteEagle whiteEagle = new WhiteEagle();

    /**
     * 建造一个模型，提供一个执行方法的顺序
     *
     * @param sequence
     */
    @Override
    public void setSequence(List sequence) {
        this.whiteEagle.setSequence(sequence);
    }

    /**
     * 获得建造完成的模型
     *
     * @return
     */
    @Override
    public EagleModel getEagleModel() {
        return this.whiteEagle;
    }

}
