package com.ceela; 

import com.birdbrain.Finch;

public class tucker{

    public static void main (String[] args){
        Finch bird = new Finch();
        
        // bird.setMove ("F",10,50);

        int e = NoteCreator.findNote("E");
        int d = NoteCreator.findNote("D");
        int c = NoteCreator.findNote("C");
        int g = NoteCreator.findNote("G");


        bird.playNote(e, 1);
        bird.pause(0.25);
        bird.playNote(d, 1);
        bird.pause(0.25);
        bird.playNote(c, 1);
        bird.pause(0.25);
        bird.playNote(d, 1);
        bird.pause(0.25);
        bird.playNote(e, 1);
        bird.pause(0.25);
        bird.playNote(e, 1);
        bird.pause(0.25);
        bird.playNote(e, 1);
        bird.pause(0.5);

        bird.playNote(d, 1);
        bird.pause(0.25);
        bird.playNote(d, 1);
        bird.pause(0.25);
        bird.playNote(d, 1);
        bird.pause(0.5);
        bird.playNote(e, 1);
        bird.pause(0.25);
        bird.playNote(g, 1);
        bird.pause(0.5);


        bird.stop();
        bird.disconnect();
    }
}