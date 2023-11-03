package com.example.myoop;

import android.util.Log;

public class Lion extends Cat implements Movable, Printable{
   /* public void talk(){
        Log.i("talk()", "RRRRR! I m lion. My name is " + name + ", and I'm " + age + " years old." + Cat.whatCatsLike());
    }
*/
    public Lion (){
        super();
        Log.i("constructor", "Constructor Lion");
    }
    @Override
    public void draw() {
        Log.i("draw", "Draw Lion");

    }

    @Override
    public void move() {

    }

    @Override
    public void print() {

    }
}
