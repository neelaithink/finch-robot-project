package com.ceela; 

import com.birdbrain.Finch;

//
public class tucker{

    public static void main (String[] args){
        Finch bird = new Finch();
        
        // Finds the note needed from the midi to musical notes txt

        int e = NoteCreator.findNote("E");
        int a = NoteCreator.findNote("A");
        int d = NoteCreator.findNote("D");
        int g = NoteCreator.findNote("G");
        int f = NoteCreator.findNote("F#/Gb");
        int b = NoteCreator.findNote("B");
        int c = NoteCreator.findNote("C");

      // plays the song happy birthday
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
        // displays happy birthday and then makes bird dance 
      bird.print("HAPPY BIRTHDAY");
      bird.setBeak(0,100,0);
      bird.setMove("F",10,75);
      bird.setMove("B",10,75);
      bird.setTurn("R",360,100);
       bird.setTurn("L",360,100);
        bird.setTurn("R",360,100);
            bird.setTurn("L",360,100);

        bird.stop();
        bird.disconnect();
    }
}