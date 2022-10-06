package com.tomaspm98.hero;

import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Arena {
    private int width;
    private int height;

    Position position=new Position(10,10);
    Hero hero=new Hero(position);

    //Position position=new Position(10,10);

    Arena(int width, int height){
        this.width=width;
        this.height=height;
    }

    public void draw(Screen screen){
        screen.setCharacter(position.getX(), position.getY(), TextCharacter.fromCharacter('X')[0]);
    }


    public void moveHero(Position position) {
            hero.setPosition(position);
    }

    public void processKey (com.googlecode.lanterna.input.KeyStroke key) throws IOException {
        //System.out.println(key);
        switch (key.getKeyType()){
            case ArrowUp:
                moveHero(hero.moveUp());
                break;
            case ArrowDown:
                moveHero(hero.moveDown());
                break;
            case ArrowLeft:
                moveHero(hero.moveLeft());
                break;
            case ArrowRight:
                moveHero(hero.moveRight());
                break;
            default: break;
        }
    }
}
