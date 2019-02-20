package org.academiadecodigo.bootcamp.UtilitiesPack;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 20/02/2019.
 */
public class PingPong extends Utilities {

    private Picture background = new Picture(10,10,"bg.jpg");

    public boolean isUnlocked() {
        return isUnlocked;
    }

    public void setUnlocked() {
        isUnlocked = true;
    }

    private boolean isUnlocked=false;


    @Override
    public void drawStage() {

    }

    @Override
    public void hideStage() {

    }
}
