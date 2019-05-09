package com.example.demo.director;

import com.example.demo.builder.BlackBuilder;
import com.example.demo.builder.WhiteBuilder;
import com.example.demo.model.BlackEagle;
import com.example.demo.model.WhiteEagle;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @pathName：Director
 * @author：ZhangWei
 */
public class Director {

    /**
     * 方法执行顺序——建造出的模型拥有的方法
     */
    private List<String> sequence = Lists.newArrayList();

    /**
     * 黑鹰
     */
    private BlackBuilder blackBuilder = new BlackBuilder();

    /**
     * 白鹰
     */
    private WhiteBuilder whiteBuilder = new WhiteBuilder();

    /**
     * 黑鹰——A
     *
     * @return
     */
    public BlackEagle getBlackEagleA() {
        //清理拥有的方法
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("fly");
        this.sequence.add("stop");
        //按照拥有的方法建造
        this.blackBuilder.setSequence(this.sequence);
        return (BlackEagle) this.blackBuilder.getEagleModel();
    }

    /**
     * 黑鹰——B
     *
     * @return
     */
    public BlackEagle getBlackEagleB() {
        //清理拥有的方法
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("fly");
        //按照拥有的方法建造
        this.blackBuilder.setSequence(this.sequence);
        return (BlackEagle) this.blackBuilder.getEagleModel();
    }

    /**
     * 白鹰——A
     *
     * @return
     */
    public WhiteEagle getWhiteEagleA() {
        //清理拥有的方法
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("fly");
        this.sequence.add("stop");
        //按照拥有的方法建造
        this.whiteBuilder.setSequence(this.sequence);
        return (WhiteEagle) this.whiteBuilder.getEagleModel();
    }

    /**
     * 白鹰——B
     *
     * @return
     */
    public WhiteEagle getWhiteEagleB() {
        //清理拥有的方法
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("fly");
        //按照拥有的方法建造
        this.whiteBuilder.setSequence(this.sequence);
        return (WhiteEagle) this.whiteBuilder.getEagleModel();
    }

}
