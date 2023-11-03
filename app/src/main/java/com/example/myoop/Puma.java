package com.example.myoop;

import android.util.Log;

public class Puma extends Cat implements Movable, Printable{

    public void talk(){
        Log.i("talk()", "R-r-r ! I m puma! My name is " + name + ", and I'm " + age + " years old.");
    }

    @Override
    public void draw() {
        Log.i("draw", "Draw Puma");
    }

    @Override
    public void move() {
        Log.i("move", "Move Lion");
    }

    @Override
    public void print() {
        Log.i("print", "Print Lion");
    }
}
