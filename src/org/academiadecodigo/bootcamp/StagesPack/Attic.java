package org.academiadecodigo.bootcamp.StagesPack;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 19/02/2019.
 */
public class Attic extends Stages {

    private Picture background = new Picture(10,10,"bg2.jpg");
    private boolean isUnlocked=true;



    @Override
    public boolean isUnlocked() {
        return isUnlocked;
    }

    @Override
    public void init() {
        drawStage();


    }

    @Override
    public void drawStage() {
        background.draw();

    }

    @Override
    public void hideStage() {
        background.delete();

    }

    @Override
    public void startPokemon() {

    }

    @Override
    public void setUnlocked(){
        isUnlocked=true;
    }
}
