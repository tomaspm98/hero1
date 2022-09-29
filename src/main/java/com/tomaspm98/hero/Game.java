package com.tomaspm98.hero;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {
    Screen screen;
    Game() {
        try {
            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            screen = new TerminalScreen(terminal);
            TerminalSize terminalSize=new TerminalSize(40,20);
            DefaultTerminalFactory terminalFactory=new DefaultTerminalFactory().setInitialTerminalSize(terminalSize);
            Terminal terminal1 =terminalFactory.createTerminal();

            screen.setCursorPosition(null);
            screen.startScreen();
            screen.doResizeIfNecessary();
            screen.clear();
            screen.setCharacter(10,10, TextCharacter.fromCharacter('X')[0]);
            screen.refresh();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    private void draw() throws IOException {
        screen.clear();
        screen.setCharacter(10, 10, TextCharacter.fromCharacter('X')[0]);
        screen.refresh();
    }

    public void run() throws IOException {
        draw();
    }
    public static void main(String[] args) throws IOException {
     Game game=new Game();
     game.run();
    }


}
