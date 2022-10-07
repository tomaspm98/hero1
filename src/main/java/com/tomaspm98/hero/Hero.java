package com.tomaspm98.hero;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

public class Hero extends Element {
    //private Position position;

    public Hero (int x, int y){super(x,y);}

    public Position getPosition(){
        return position;
    }

    public void setPosition(Position position){
        this.position=position;
    }

    public void draw(Screen screen){
        screen.setCharacter(position.getX(), position.getY(), TextCharacter.fromCharacter('X')[0]);
    }

    public Position moveDown(){
        return new Position(position.getX(),position.getY()+1);
    }

    public Position moveLeft(){
        return new Position(position.getX()-1,position.getY());
    }

    public Position moveUp(){
        return new Position(position.getX(),position.getY()-1);
    }

    public Position moveRight(){
        return new Position(position.getX()+1,position.getY());
    }

    public void draw(TextGraphics graphics){
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF33"));
        graphics.enableModifiers(SGR.BOLD);
        //graphics.putString(new TerminalPosition(hero.getPosition().getX(), hero.getPosition().getY()), "X");
    }

}
