package com.springBasics.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("climb");
    }
    @Override
    public void down() {
        System.out.println("slide");
    }
    @Override
    public void left() {
        System.out.println("escape left");
    }
    @Override
    public void right() {
        System.out.println("escape right");
    }

}
