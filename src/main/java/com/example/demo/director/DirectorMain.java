package com.example.demo.director;

/**
 * @pathName：DirectorMain
 * @author：ZhangWei
 */
public class DirectorMain {

    public static void main(String[] args) {
        //建造者类
        Director director = new Director();

        //建造
        director.getBlackEagleA().move();
        director.getBlackEagleB().move();
        director.getWhiteEagleA().move();
        director.getWhiteEagleB().move();
    }

}
