package com.springBasics.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GamingConsole{
    @Override
    public void up() {
        System.out.println("fly");
    }
    @Override
    public void down() {
        System.out.println("swim");
    }
    @Override
    public void left() {
        System.out.println("bomb blast");
    }
    @Override
    public void right() {
        System.out.println("shoot arrow");
    }
}
