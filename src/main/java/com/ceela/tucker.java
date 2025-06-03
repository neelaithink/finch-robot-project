package com.ceela; 

import com.birdbrain.Finch;

public class tucker{

    public static void main (String[] args){
        Finch bird = new Finch();
        
        // bird.setMove ("F",10,50);

        int e = NoteCreator.findNote("E");
        int a = NoteCreator.findNote("A");
        int d = NoteCreator.findNote("D");
        int g = NoteCreator.findNote("G");
        int f = NoteCreator.findNote("F#/Gb");
        int b = NoteCreator.findNote("B");
        int c = NoteCreator.findNote("C");


        bird.playNote(d, 1);
        bird.pause(0.25);
         bird.playNote(d, 1);
        bird.pause(0.25);
         bird.playNote(e, 1);
        bird.pause(0.25);
        bird.playNote(d, 1);
        bird.pause(0.25);
         bird.playNote(g, 1);
        bird.pause(0.25);
         bird.playNote(f, 2);
        bird.pause(0.25);

         bird.playNote(d, 1);
        bird.pause(0.25);
         bird.playNote(d, 1);
        bird.pause(0.25);
         bird.playNote(e, 1);
        bird.pause(0.25);
         bird.playNote(d, 1);
        bird.pause(0.25);
         bird.playNote(a, 1);
        bird.pause(0.25);
        bird.playNote(g, 2);
        bird.pause(0.25);

       bird.playNote(d, 1);
        bird.pause(0.25);
         bird.playNote(d, 1);
        bird.pause(0.25);
         bird.playNote(d, 1);
        bird.pause(0.25);
        bird.playNote(b, 1);
        bird.pause(0.25);
         bird.playNote(g, 1);
        bird.pause(0.25);
         bird.playNote(f, 1);
        bird.pause(0.5);
          bird.playNote(e, 2);
        bird.pause(0.25);

         bird.playNote(c, 1);
        bird.pause(0.25);
         bird.playNote(c, 1);
        bird.pause(0.25);
         bird.playNote(b, 1);
        bird.pause(0.25);
        bird.playNote(g, 1);
        bird.pause(0.25);
         bird.playNote(a, 1);
        bird.pause(0.25);
         bird.playNote(g, 2);
        bird.pause(0.25);

      

        bird.stop();
        bird.disconnect();
    }
}