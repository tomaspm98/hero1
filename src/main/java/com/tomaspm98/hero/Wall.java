package com.tomaspm98.hero;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.util.List;

public class Wall {
    Position position;

    Wall (Position position){
        this.position=position;
    }

    public Position getPosition(){
        return position;
    }



    public void draw(TextGraphics graphics) {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#FF5722"));
        //graphics.putString(new TerminalPosition(position.getX(), position.getY()), " ");
    }


}
